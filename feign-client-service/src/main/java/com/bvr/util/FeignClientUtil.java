package com.bvr.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="feignDemo", url = "http://localhost:8081/user")
public interface FeignClientUtil {

	@GetMapping("/servicename")
	String getServiceName();
	
	@GetMapping("/serviceaddress")
	String getServiceAddress();
	
	@GetMapping("/servicedetails")
	String getServiceDetails();
}
