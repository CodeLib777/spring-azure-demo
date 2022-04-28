package com.example.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {
	@GetMapping("/message")
	public String message(){
		return "Congrats! Your App Deployed Successfully on azure!";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoApplication.class, args);
	}

}
