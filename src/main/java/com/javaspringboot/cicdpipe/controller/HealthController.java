package com.javaspringboot.cicdpipe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

	@GetMapping("/")
	public String health() {
		return "The server is up and running";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello from the CICD Application";
	}
}
