package com.example.UC4_PostRequestMethod;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    // POST request to accept firstName and lastName
    @PostMapping("/post")
    public String sayHello(@RequestBody UserDTO user) {

        user.setFirstName(user.firstName);
        user.setLastName(user.lastName);
        return user.getFirstName()+" "+user.getLastName();
    }


}
