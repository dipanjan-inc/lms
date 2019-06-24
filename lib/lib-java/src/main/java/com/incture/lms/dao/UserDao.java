package com.incture.lms.dao;

import org.springframework.stereotype.Repository;

import com.incture.lms.dto.ResponseDto;
import com.incture.lms.dto.UserDto;
import com.incture.lms.entity.UserDo;
import com.incture.lms.util.ServiceUtil;
import com.incture.lms.util.TableConfig;

@Repository
public class UserDao extends BaseDao {
	public ResponseDto saveUser(UserDto dto){
		ResponseDto response = new ResponseDto();
		try{
			this.getSession().save(importUserDto(dto));
			response.setMessage("Success");
			response.setStatus("200");
			return response;
		}catch (Exception e) {
			response.setMessage("Failed");
			response.setStatus("500");
			return response;
		}
		
	}

	private UserDo importUserDto(UserDto dto) {
		UserDo user = new UserDo();
		String userCode = nextVal("\""+TableConfig.SCHEMA+"\"","\""+TableConfig.PACKAGE+"\\:\\:LMS_USER.USER_CODE\"");
		user.setUserCode(userCode);
		user.setUserEmail(dto.getUserEmail());
		user.setUserId(dto.getUserId());
		user.setUserImage(dto.getUserImage());
		user.setUserName(dto.getUserName());
		user.setUserPassword(dto.getUserPassword());
		user.setUserRegisteredDate(ServiceUtil.getTimestamp());
		return user;
		
	}
}
