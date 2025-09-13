package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.bean.Student;

@SpringBootApplication
public class SbProject3Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SbProject3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(std1());
		System.out.println("-----------");
		System.out.println(std2());

	}

	@Bean
	public Student std1() {
		return new Student("Navya", 101, 20);
	}
	
	public Student std2() {
		return new Student("Amit", 102, 30);
	}

}
