package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StandaloneProjectApplication {

	public static void main(String[] args) {
		System.out.println("SB Application started.");
		SpringApplication.run(StandaloneProjectApplication.class, args);
		System.out.println("SB Application ended.");
	}

}
