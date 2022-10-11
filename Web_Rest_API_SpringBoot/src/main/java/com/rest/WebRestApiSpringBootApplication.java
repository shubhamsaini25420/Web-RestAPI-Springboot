package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;

@SpringBootApplication
@Validated
public class WebRestApiSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebRestApiSpringBootApplication.class, args);
	}

}
