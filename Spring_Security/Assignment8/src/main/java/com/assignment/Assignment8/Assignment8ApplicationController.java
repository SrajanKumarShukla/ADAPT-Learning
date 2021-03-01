package com.assignment.Assignment8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Assignment8ApplicationController {
	@GetMapping("/")
	public String home() {
		return "index";
	}
}
