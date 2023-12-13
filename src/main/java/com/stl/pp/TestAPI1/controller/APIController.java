package com.stl.pp.TestAPI1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
	
	@GetMapping("/welcome")
	String getMessage() {
		return "Welcome to Sogeti Labs!!!";
	}

}
