package com.assignment.Assignment1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Assignment1ApplicationController {
	@RequestMapping("/hello")
	public String Assignment1Application() {
		return "Hello World";
	}

}
