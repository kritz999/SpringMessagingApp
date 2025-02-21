package com.example.UC2_GetRequest;


import org.springframework.web.bind.annotation .*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    // GET request with a query parameter
    @GetMapping("/query")
    public String sayHello(@RequestParam(value = "name", defaultValue = "Guest") String name) {
        return "Hello " + name + " from BridgeLabz!";
    }
}
