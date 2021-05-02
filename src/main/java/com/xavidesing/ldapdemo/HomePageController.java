package com.xavidesing.ldapdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {

	@GetMapping("/")
	public String index() {
		return "Welcome to the home page!";
	}
}