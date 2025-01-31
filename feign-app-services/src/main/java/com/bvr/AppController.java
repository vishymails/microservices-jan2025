package com.bvr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class AppController {

	public AppController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/servicename")
	public String getServiceName() {
		return "Welcome Oracle : India";
	}
	
	@GetMapping("/serviceaddress")
	public String getServiceAddress() {
		return "Location : Bangalore ";
	}
	
	@GetMapping("/servicedetails")
	public String getServiceDetails() {
		return "Spring Boot Microservices Feign Demo";
	}
}
