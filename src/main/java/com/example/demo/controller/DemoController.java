package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/api")
public class DemoController {
	@GetMapping("/wel")
	public String welcome() {
		return "welcome to demo app";
	}
	@GetMapping("/hell")
	public String hello() {
		return "hello to demo app";
	}

}
