package com.minikube.minikube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MinikubeApplication {

	@GetMapping("/status")
	public String getStatusApp() {
		return "Hola Kubernete!!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MinikubeApplication.class, args);
	}

}
