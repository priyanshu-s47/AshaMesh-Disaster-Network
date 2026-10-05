package com.ashamesh.sosservice.controller;

import com.ashamesh.sosservice.model.SosCall;
import com.ashamesh.sosservice.service.SosEventPublisher;
import com.ashamesh.sosservice.repository.SosCallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;


@RestController
@RequestMapping({"/api/sos", "/sos-service/api/sos"})
public class SosCallController {

    @Autowired
    private SosCallRepository sosCallRepository;

    @Autowired
    private SosEventPublisher sosEventPublisher;
    // Recieving new SOS Request/Distress
    @PostMapping("/trigger")
    public SosCall triggerSos(@RequestBody SosCall sosCall) {
        sosCall.setStatus("PENDING");
        sosCall.setTimestamp(LocalDateTime.now());

        SosCall savedCall = sosCallRepository.save(sosCall);
        sosEventPublisher.publishSosEvent(savedCall);

        return savedCall;
    }

    // 🚨 HEAVY VELOISTY LOAD GENERATOR: Ek single click par background mein 2000 entries karega!
    @PostMapping("/load-test/{count}")
    public String runBulkLoadTest(@PathVariable int count) {
        java.util.Random random = new java.util.Random();

        for (int i = 0; i < count; i++) {
            SosCall fakeCall = new SosCall();
            fakeCall.setVictimName("Automated-Victim-" + i);
            fakeCall.setPhoneNumber("99999" + String.format("%05d", i));
            fakeCall.setEmergencyType("FLOOD");

            // Random latitude/longitude points generate honge realistic testing ke liye
            fakeCall.setLatitude(20.0 + (30.0 - 20.0) * random.nextDouble());
            fakeCall.setLongitude(70.0 + (90.0 - 70.0) * random.nextDouble());
            fakeCall.setStatus("PENDING");
            fakeCall.setTimestamp(LocalDateTime.now());

            // 1. Physical database persistence lookup locking
            SosCall saved = sosCallRepository.save(fakeCall);

            // 2. Kafka async real-time stream event publishing
            try {
                sosEventPublisher.publishSosEvent(saved);
            } catch (Exception e) {
                // Background logs capture skips if broker memory queues fill up
            }
        }
        return "🔥 SYSTEM BOMBARDED SUCCESSFULLY! Injected " + count + " unique disaster alerts into network grid.";
    }


    // Checking the list of active Distress Calls
    @GetMapping("/active-calls")
        public List<SosCall> getAllActiveCalls(){
            return sosCallRepository.findAll();
        }

    @GetMapping("/test")
    public String testEndpoint() {
        return "Microservice chal rahi hai!";
    }


}
