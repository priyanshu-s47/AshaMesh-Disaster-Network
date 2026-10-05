package com.ashamesh.sosservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ashamesh")
public class SosServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SosServiceApplication.class, args);
	}

}
