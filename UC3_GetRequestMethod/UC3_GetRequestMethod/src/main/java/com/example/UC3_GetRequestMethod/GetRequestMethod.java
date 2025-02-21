package com.example.UC3_GetRequestMethod;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
public class GetRequestMethod {

    @GetMapping("/param/{name}")
    public String sayHello(@PathVariable String name){
        return "Hello" + name +"from BridgeLabz!";
    }
}
