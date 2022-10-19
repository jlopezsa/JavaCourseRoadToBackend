package com.helloworld.helloworldapi.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiController {

    @GetMapping("/")
    public String getMessage() {
        return "Este es un mensaje desde el controlador";
    }

    @GetMapping("/user")
    public String getNewMessage() {
        return "Este es un mensaje del controlador desde otra url";
    }
}
