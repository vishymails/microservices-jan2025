package com.bvr;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {

	private final WebClient webClient;

	public UserService(WebClient webClient) {
		super();
		this.webClient = webClient;
	}
	
	/*
	//sync call 
	public Mono<String> getUserById() {
		return webClient.get().uri("/oracleblr/users").retrieve().bodyToMono(String.class);
	}
	*/
	
	//async call 
		public Flux<String> getUserById() {
			return webClient.get().uri("/oracleblr/users").retrieve().bodyToFlux(String.class);
		}
		
}
