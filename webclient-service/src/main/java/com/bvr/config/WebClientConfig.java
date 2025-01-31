package com.bvr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

	public WebClientConfig() {
		// TODO Auto-generated constructor stub
	}
	
	@Bean 
	public WebClient webClient(WebClient.Builder builder) {
		return builder.baseUrl("http://localhost:9000")
				.build();
	}

}
