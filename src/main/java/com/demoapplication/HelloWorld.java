package com.demoapplication;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorld {
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorld.class, args);
	}
	
	@RequestMapping(value = "/")
	public String hello() {
		return "Hello World";
	}
}
