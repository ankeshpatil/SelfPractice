package com.ankeshcode.blog.controllers;

import com.ankeshcode.blog.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/users")
public class UserController {
	
@Autowired
	private UserService userService;

	//POST :to create user
	//PUT : To update user
	//DELETE : To Delete user
	//GET : To get user
	
}
