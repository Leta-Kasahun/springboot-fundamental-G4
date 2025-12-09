package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello world";
    }
    @GetMapping("/servelet")
    public String servelet1(){
        return "Hello thewse is from  the servelet";
    }
}

// main landing page the home route
