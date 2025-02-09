package com.bvr.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEndPoint1 {

	public MyEndPoint1() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/mypage")
	public String myString() {
		return "First Microservice Example";
	}
	
	@RequestMapping("/second")
	public String sayHello(@RequestParam String name) {
		return "Welcome : " + name;
	}
	
	@RequestMapping(path="/pathvarexample/{name}")
	public String sayHello2(@PathVariable String name) {
		return "Path Definitiones : " + name ;
	}
	
	
	@GetMapping(path = "/secondSampleBean")
	public SecondSampleBean secondBean() {
		return new SecondSampleBean("For Oracle India");
	}

}
