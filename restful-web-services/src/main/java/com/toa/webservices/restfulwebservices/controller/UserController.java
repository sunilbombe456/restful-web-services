package com.toa.webservices.restfulwebservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toa.webservices.restfulwebservices.dao.UserService;
import com.toa.webservices.restfulwebservices.entity.User;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/user")
	public List<User> getUser(){
		return service.findAll();
	}

}
