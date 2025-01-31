package com.bvr.models;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable {

	

	private final String jwt;

	public AuthenticationResponse(String jwt) {
		super();
		this.jwt = jwt;
	}

	public String getJwt() {
		return jwt;
	}
	
	
	
}
