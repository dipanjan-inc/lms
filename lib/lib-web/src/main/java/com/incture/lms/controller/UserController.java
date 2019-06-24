package com.incture.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incture.lms.dto.ResponseDto;
import com.incture.lms.dto.UserDto;
import com.incture.lms.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping(value="/saveUser")
	public ResponseDto saveUser(UserDto dto){
		return userService.saveUser(dto);
	}
}
