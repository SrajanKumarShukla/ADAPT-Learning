package com.assignment.Assignment2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Assignment2ApplicationController {
	@GetMapping("/")
	public String home() {
		return "index";
	}
}
