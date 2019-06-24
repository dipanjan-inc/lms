package com.incture.lms.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.incture.lms.dao.UserDao;
import com.incture.lms.dto.ResponseDto;
import com.incture.lms.dto.UserDto;
import com.incture.lms.service.UserService;

public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;
	@Override
	public ResponseDto saveUser(UserDto dto) {
		return userDao.saveUser(dto);
	}

}
