package com.cloudsea.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableAutoConfiguration
@ComponentScan("com.cloudsea.*")
@EnableSwagger2
public class ClsMessageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClsMessageServiceApplication.class, args);
	}
}
