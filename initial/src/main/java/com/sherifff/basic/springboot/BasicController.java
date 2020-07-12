package com.sherifff.basic.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BasicController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}


	@RequestMapping("/root")
	public String root() {
		return "Greetings from Spring Boot, I am root!";
	}

	@RequestMapping("/admin")
	public String admin() {
		return "Greetings from Spring Boot, I am admin!";
	}

}
