package com.web_application.cicd.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/healthz")
public class HealthCheckController {
	
	@GetMapping
	public ResponseEntity<Void> healthCheck(HttpServletRequest request) {
		return ResponseEntity.status(HttpStatus.OK)
				.header("Cache-Control", "no-cache, no-store, must-revalidate")
				.header("Pragma", "no-cache")
				.header("X-Content-Type-Options", "nosniff")
				.build();
	}
	
}
