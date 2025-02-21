package com.example.UC1_RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // GET request handling
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz!";
    }
}