package com.ashamesh.sosservice.service;

import com.ashamesh.sosservice.model.SosCall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SosEventPublisher {

    private static final String TOPIC = "disaster-sos-topic";

    @Autowired
    private KafkaTemplate<String, SosCall> kafkaTemplate;

    public void publishSosEvent(SosCall sosCall){
        kafkaTemplate.send(TOPIC, sosCall.getId().toString(),sosCall);
        System.out.println("Real-Time Event Streamed to Kafka Topic for Victim :" + sosCall.getVictimName());
    }
}
