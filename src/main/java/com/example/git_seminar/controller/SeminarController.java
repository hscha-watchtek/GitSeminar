package com.example.git_seminar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.git_seminar.service.SeminarService;

@RestController
public class SeminarController {

	private final SeminarService seminarService;

	public SeminarController(SeminarService seminarService) {
		this.seminarService = seminarService;
	}

	@GetMapping("/health")
	public String healthCheck() {
		return "Hello, the seminar service is running!";
	}

	@GetMapping("/seminar")
	public String getSeminarContent() {
		return seminarService.getContent();
	}
}
