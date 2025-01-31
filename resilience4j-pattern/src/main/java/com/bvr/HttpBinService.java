package com.bvr;

import java.util.Map;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HttpBinService {

	public HttpBinService() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired 
	private RestTemplate rest;

	public HttpBinService(RestTemplate rest) {
		super();
		this.rest = rest;
	}
	
	public Map get() {
		return rest.getForObject("https://httpbin.org/get", Map.class);
	}
	
	public Map delay(int seconds) {
		return rest.getForObject("https://httpbin.org/delay/" + seconds, Map.class);
		
	}
	
	public Supplier<Map> delaySupplier(int seconds ) {
		return () -> this.delay(seconds);
	}

}
