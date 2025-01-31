package com.bvr;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	public DemoController() {
		// TODO Auto-generated constructor stub
	}
	
	Logger LOG = LoggerFactory.getLogger(DemoController.class);
	
	@Autowired
	private CircuitBreakerFactory circuitBreakerFactory;
	
	@Autowired 
	private HttpBinService httpBin;

	public DemoController(CircuitBreakerFactory circuitBreakerFactory, HttpBinService httpBin) {
		super();
		this.circuitBreakerFactory = circuitBreakerFactory;
		this.httpBin = httpBin;
	}
	
	@GetMapping("/get")
	public Map get() {
		return httpBin.get();
	}
	
	
	@GetMapping("/delay/{seconds}")
	public Map delay(@PathVariable int seconds) {
		return circuitBreakerFactory.create("delay").run(httpBin.delaySupplier(seconds), t -> {
			LOG.warn("delay service call failed error", t);
			Map<String, String> fallback = new HashMap<>();
			
			fallback.put("Message_from_fallback_functionality", "Alternative path from Oracle India");
			return fallback;
		});
	}
}
