package com.ankeshcode.blog.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//DTO:Data Transfer Object :it's one of the design pattern

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

	private int id;
	private String name;
	private String email;
	private String about;
	private String password;

}
