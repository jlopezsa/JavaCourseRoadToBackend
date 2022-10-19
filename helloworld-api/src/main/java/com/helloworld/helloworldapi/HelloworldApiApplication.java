package com.helloworld.helloworldapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApiApplication.class, args);
		System.out.println("App running in 8080 port");
	}

}
