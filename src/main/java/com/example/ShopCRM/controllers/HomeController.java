package com.example.ShopCRM.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/welcome")
	ResponseEntity<String> welcome() {
		return new ResponseEntity<>("welcome to software development business", HttpStatus.OK); 
	}
	
	@GetMapping("/privateWelcome")
	ResponseEntity<String> privateWelcome() {
		return new ResponseEntity<>("privateWelcome",HttpStatus.CREATED) ;
	}
	
}
