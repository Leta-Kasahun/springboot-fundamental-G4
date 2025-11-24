package com.example.demo.controller;



import com.example.demo.model.User;
import com.example.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// @RestController → Handles API requests + returns JSON
@RestController
@RequestMapping("/api")   // base path
public class DeMoApi {

    // @Autowired → injects service automatically
    @Autowired
    private MessageService messageService;

    // ---------- GET: Simple message ----------
    @GetMapping("/helloDemo")
    public String hello() {
        return "Spring Boot Demo API is running!";
    }

    // ---------- GET with @PathVariable ----------
    @GetMapping("/hello/{name}")
    public String greetWithName(@PathVariable String name) {
        return messageService.greet(name);
    }
   
    }

