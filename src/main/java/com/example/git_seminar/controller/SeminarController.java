package com.example.git_seminar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeminarController {

	@GetMapping("/health")
	public String healthCheck() {
		return "OK";
	}
}
