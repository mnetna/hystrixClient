package com.example.springcorsclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker
@SpringBootApplication
public class SpringcorsclientApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringcorsclientApplication.class);
        app.run(args);
    }
}
