package com.assignment.Assignment1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Assignment1ApplicationController {
	@RequestMapping("/")
	public String Assignment1Application() {
		return "index";
	}

}
