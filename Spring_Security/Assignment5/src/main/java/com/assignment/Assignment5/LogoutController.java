package com.assignment.Assignment5;

import org.springframework.web.bind.annotation.GetMapping;

public class LogoutController {
	@GetMapping("/logout")
	public String logout() {
		return "login";
	}

}
