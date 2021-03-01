package com.Assignment.Assignment2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Assignment2ApplicationController {
	@RequestMapping("/Assignment2")
	public String Assignment1Application() {
		return "<html><title>Hello</title><body><h1>Bonjour, tout le monde!</h1><body></html>";
	}
}
