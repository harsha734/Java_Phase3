package com.simplilearn.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages="com.simplilearn.rest")
public class RestfullapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfullapiApplication.class, args);
	}

}
