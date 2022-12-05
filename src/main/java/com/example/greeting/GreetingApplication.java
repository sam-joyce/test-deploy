package com.example.greeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class GreetingApplication {
	public static void main(String[] args) {
		SpringApplication.run(GreetingApplication.class, args);
	}

	@GetMapping("/welcome")
	public String appWelcome() {
		return "Welcome to my API.";
	}

	@GetMapping("/names")
	public List<String> showNames() {
		return List.of("Sam", "Steph", "Ollie");
	}



}
