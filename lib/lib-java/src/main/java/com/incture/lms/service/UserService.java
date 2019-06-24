package com.incture.lms.service;

import com.incture.lms.dto.ResponseDto;
import com.incture.lms.dto.UserDto;

public interface UserService {
	ResponseDto saveUser(UserDto dto);
}
