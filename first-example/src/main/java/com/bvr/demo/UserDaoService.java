package com.bvr.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	public UserDaoService() {
		// TODO Auto-generated constructor stub
	}
	
	
	private static List<User> users = new ArrayList<>();
	
	private static int usersCount = 3;
	
	static {
		users.add(new User(1, "Ram", new Date()));
		users.add(new User(2, "Raj", new Date()));
		users.add(new User(3, "Rajesh", new Date()));
	}
	
	public List<User> findAll() {
		return users;
	}

}
