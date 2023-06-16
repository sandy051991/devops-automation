package com.test.DockerApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerAppApplication.class, args);
	}
	
	@GetMapping("/info")
	public ResponseEntity getInfo() {
		
		return new ResponseEntity<>("Welcome to the SpringBoot web app", HttpStatus.OK);
	}

}
