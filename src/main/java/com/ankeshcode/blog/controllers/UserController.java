package com.ankeshcode.blog.controllers;

import java.util.HashSet;
import java.util.List;

import com.ankeshcode.blog.payloads.UserDto;
import com.ankeshcode.blog.service.UserService;
import com.ankeshcode.blog.serviceImpl.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;
	private UserServiceImpl u;

	// POST :to create user
	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
		UserDto createUserDto = this.userService.createUser(userDto);
		return new ResponseEntity<>(createUserDto, HttpStatus.CREATED);
	}

	// PUT : To update user
	@PutMapping("/update")
	public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto, @PathVariable Integer Id) {
		UserDto updateUserDto = this.userService.updateUser(userDto, Id);
		return new ResponseEntity<>(updateUserDto, HttpStatus.ACCEPTED);
	}
	

	// DELETE : To Delete user
	@DeleteMapping("/delete/{Id}")
	public ResponseEntity<UserDto> deleteUser(@PathVariable Integer Id) {
		this.userService.deleteUser(Id);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	// GET : To get user
	@GetMapping("/get")
	public ResponseEntity<List<UserDto>> getUser() {
		List<UserDto> list = this.userService.getAllUsers();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@GetMapping("getbyid/{Id}")
	public ResponseEntity<UserDto> getUserById(@PathVariable Integer Id) {
		UserDto user = this.userService.getUserById(Id);
		return new ResponseEntity<UserDto>(user, HttpStatus.OK);
	}
	
	
	
}
