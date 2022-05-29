package com.ch.containerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ContainerDemoApplication {
	
	  @RequestMapping("/")
	  public String home() {
	    return "Hello from Spring Boot container";
	  }


	public static void main(String[] args) {
		SpringApplication.run(ContainerDemoApplication.class, args);
	}

}
