package com.khelo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dummy {
	
	@GetMapping("/health")
	public String health() {
		return "Working fine!!";
	}

}
