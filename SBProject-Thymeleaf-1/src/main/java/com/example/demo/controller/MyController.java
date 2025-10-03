package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/openProfile")
	public String openProfilePage(Model model) {
		String name = "Sneha";
		model.addAttribute("modelName", name);
		return "profile";
	}

	@GetMapping("/openConditional")
	public String openConditionalPage(Model model) {
		int num1 = 10;
		int num2 = 20;

		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);

		return "conditional";
	}

	@GetMapping("/openIteration")
	public String openIterationPage(Model model) {

		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		model.addAttribute("modelnumbers", numbers);

		return "looping";
	}

}
