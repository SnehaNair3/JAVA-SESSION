package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {

	@Autowired
	private UserService userService;

	@GetMapping("/registerPage")
	public String openRegister(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}

	@PostMapping("/registerForm")
	public String submitRegisterPage(@ModelAttribute("user") User user, Model model) {

		boolean status = userService.registerUser(user);
		if (status) {
			model.addAttribute("successMsg", "User registered successfully.");
		} else {
			model.addAttribute("errorMsg", "Failed to register. Please try again");
		}

		return "register";
	}

	@GetMapping("/loginPage")
	public String openLoginPage(Model model) {

		model.addAttribute("user", new User());
		return "login";
	}

	@PostMapping("/loginForm")
	public String submitLoginForm(@ModelAttribute("user") User user, Model model) {

		User validUser = userService.login(user.getEmail(), user.getPassword());

		if (validUser != null) {
			model.addAttribute("modelname", validUser.getName());
			return "profile";
		} else {
			model.addAttribute("errorMsg", "Email and Password do not match. Please try again.");
			return "login";
		}
	}

	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {

		HttpSession session = request.getSession(false);

		if (session != null) {
			session.invalidate();
		}
		return "redirect:/loginPage";
	}
}
