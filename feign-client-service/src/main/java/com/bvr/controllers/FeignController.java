package com.bvr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bvr.util.FeignClientUtil;

@RestController
@RequestMapping("/feigndemo")
public class FeignController {

	public FeignController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	FeignClientUtil feignClientUtil;
	
	@GetMapping("/customer-servicename")
	public String getCustomerServiceName() {
		return feignClientUtil.getServiceName();
	}

	@GetMapping("/customer-serviceaddress")
	public String getCustomerServiceAddress() {
		return feignClientUtil.getServiceAddress();
	}
	
	@GetMapping("/customer-servicedetails")
	public String getCustomerServiceDetails() {
		return feignClientUtil.getServiceDetails();
	}
}
