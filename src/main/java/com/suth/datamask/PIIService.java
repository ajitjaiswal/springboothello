package com.suth.datamask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PIIService {

	@GetMapping("hello")
	public String hello() {

		return "Hello World!";
	}

}
