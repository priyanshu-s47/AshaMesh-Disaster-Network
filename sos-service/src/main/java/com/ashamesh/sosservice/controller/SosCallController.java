package com.ashamesh.sosservice.controller;

import com.ashamesh.sosservice.model.SosCall;
import com.ashamesh.sosservice.service.SosEventPublisher;
import com.ashamesh.sosservice.repository.SosCallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;


@RestController
@RequestMapping("/api/sos")
public class SosCallController {

    @Autowired
    private SosCallRepository sosCallRepository;

    @Autowired
    private SosEventPublisher sosEventPublisher;
    // Recieving new SOS Request/Distress
    @PostMapping("/trigger")
    public SosCall triggerSos(@RequestBody SosCall sosCall){
        sosCall.setStatus("PENDING"); // by defult status will be set to pending
        sosCall.setTimestamp(LocalDateTime.now()); //setting current time

        SosCall savedCall =  sosCallRepository.save(sosCall);

        // live stram in kafka queue
        sosEventPublisher.publishSosEvent(savedCall);

        return savedCall;

    }

    // Checking the list of active Distress Calls
    @GetMapping("/active-calls")
        public List<SosCall> getAllActiveCalls(){
            return sosCallRepository.findAll();
        }

}
