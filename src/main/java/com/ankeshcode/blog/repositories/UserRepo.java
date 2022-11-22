package com.ankeshcode.blog.repositories;

import com.ankeshcode.blog.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
	

}
