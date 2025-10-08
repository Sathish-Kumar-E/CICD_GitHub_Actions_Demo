package com.web_application.cicd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1")
public class TestController {
	
	@GetMapping("/test")
	public String testMessage() {
		return "CI/CD GitHub Actions";
	}
	
	@GetMapping("/test2")
	public String testMessage2() {
		return "CI/CD GitHub Actions";
	}
	
}
