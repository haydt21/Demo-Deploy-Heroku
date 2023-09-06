package com.haydt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public String index() {
		return"hello haydt";
	}
	
	@GetMapping("/home")
	public String home() {
		return"Wellcome home";
	}
	
	@GetMapping("/about")
	public String about() {
		return"Wellcome about";
	}
	
}
