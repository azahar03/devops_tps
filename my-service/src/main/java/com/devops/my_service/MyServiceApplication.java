package com.devops.my_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
@SpringBootApplication
public class MyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyServiceApplication.class, args);
	}

	@RestController
	public static class HelloService {
		@GetMapping("/")
		public String hello() {
			return "hello";
		}
	}
}


