package com.assignment.Assignment7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Assignment7ApplicationController {
	@GetMapping("/")
	public String home() {
		return "index";
	}
	@GetMapping("/user")
	public String user() {
		return "<h1>Welcome User</h1>";
	}
	@GetMapping("/admin")
	public String admin() {
		return "<h1>Welcome Admin</h1>";
	}
}
