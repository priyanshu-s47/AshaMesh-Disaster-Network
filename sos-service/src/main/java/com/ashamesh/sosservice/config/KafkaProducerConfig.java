package com.ashamesh.sosservice.config;

import com.ashamesh.sosservice.model.SosCall;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;


@Configuration
public class KafkaProducerConfig {

    @Bean
    public ProducerFactory<String, SosCall> producerFactory(){
        Map<String, Object> configProps = new HashMap<>();

        // Setting the Local Address of Docker Container
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");

        // Defining data serializers
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

        // 🚨 NEW IMPLEMENTATION: Timeout aur Connection drops se bachne ke liye constraints
        configProps.put(ProducerConfig.REQUEST_TIMEOUT_MS_CONFIG, "5000"); // 5 seconds max wait
        configProps.put(ProducerConfig.MAX_BLOCK_MS_CONFIG, "5000");       // Prevent app freezing
        configProps.put(ProducerConfig.RETRIES_CONFIG, 2);

        return new DefaultKafkaProducerFactory<>(configProps);

    }

    @Bean
    public KafkaTemplate<String, SosCall> kafkaTemplate(){

        return new KafkaTemplate<>(producerFactory());
    }
}
