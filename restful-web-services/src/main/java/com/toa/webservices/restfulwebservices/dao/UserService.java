package com.toa.webservices.restfulwebservices.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.toa.webservices.restfulwebservices.entity.User;

@Component
public class UserService {

	private static List<User> users = new ArrayList<>();

	private static int userCounter = 3;
	
	static {
		users.add(new User(1, "adam", new Date()));
		users.add(new User(2, "Eve", new Date()));
		users.add(new User(3, "Rocky", new Date()));
	}

	public List<User> findAll() {
		return users;
	}

	public User findById(int id) {

		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	
	public void save(User user) {
		if(null == user.getId()) {
			user.setId(++userCounter);
		}
		users.add(user);
	}
	
	

}
