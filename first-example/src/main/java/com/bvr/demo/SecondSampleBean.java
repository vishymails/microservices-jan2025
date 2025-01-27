package com.bvr.demo;

public class SecondSampleBean {

	public SecondSampleBean() {
		// TODO Auto-generated constructor stub
	}
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public SecondSampleBean(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "SecondSampleBean [message=" + message + "]";
	}
	
	

}
