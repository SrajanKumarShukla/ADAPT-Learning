package com.assignment.Assignment2;

import org.springframework.web.bind.annotation.GetMapping;

public class LogoutController {
	@GetMapping("/logout")
	public String logout() {
		return "login";
	}

}
