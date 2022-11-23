package com.ankeshcode.blog.controllers;

import com.ankeshcode.blog.payloads.UserDto;
import com.ankeshcode.blog.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/users")
public class UserController {
	
@Autowired
	private UserService userService;

	//POST :to create user
@PostMapping
public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
	UserDto createUserDto=this.userService.createUser(userDto);
	return new ResponseEntity<>(createUserDto,HttpStatus.CREATED);
	
}
	//PUT : To update user
	//DELETE : To Delete user
	//GET : To get user
	
}
