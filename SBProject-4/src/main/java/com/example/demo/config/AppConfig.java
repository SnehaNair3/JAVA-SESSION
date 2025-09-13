package com.example.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.bean.Book;

@Configuration
public class AppConfig {

	@Bean
	public CommandLineRunner commandLineRunner() {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				System.out.println(book1());
				System.out.println(book2());

			}
		};

	}

	@Bean
	public Book book1() {
		return new Book("Alchemist", "Paulo coelho", 2020, "English");
	}

	@Bean
	public Book book2() {
		return new Book("Think nd Grow rich", "Napolean Hill", 2018, "English");
	}
}
