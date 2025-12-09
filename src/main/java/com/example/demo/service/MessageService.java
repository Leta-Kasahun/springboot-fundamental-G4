package com.example.demo.service;
import org.springframework.stereotype.Service;
// @Service → Contains business logic
@Service
public class MessageService {
    public String greet(String name) {
        return "Hello, " + name + "! Welcome to Spring Boot.";
    }
}
