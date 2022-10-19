package com.helloworld.helloworldapi.controller;

import com.helloworld.helloworldapi.dto.DataDTO;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiController {

    public static List<DataDTO> usuarios = new ArrayList<DataDTO>();

    @GetMapping("/")
    public String getMessage() {
        return "Este es el primer mensaje desde el controlador" + "\n" +
                "Tambien intente las siguientes rutas: \n" +
                "- http://localhost:8080/user, \n" +
                "- http://localhost:8080/data-users";
    }

    @GetMapping("/user")
    public String getNewMessage() {
        return "Este es un mensaje del controlador desde otra url";
    }

    @GetMapping("/data-users")
    public List<DataDTO> getData() {
        return usuarios;
    }

    @PostConstruct
    public void initiateList() {
        DataDTO user1 = new DataDTO("Julian", "324123", 38);
        DataDTO user2 = new DataDTO("Jair", "876576", 28);
        usuarios.add(user1);
        usuarios.add(user2);
    }
}
