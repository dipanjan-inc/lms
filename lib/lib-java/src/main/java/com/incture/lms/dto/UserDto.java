package com.incture.lms.dto;

import java.util.Date;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDto {
	private String userCode;
	private String userName;
	private String userId;
	private String userEmail;
	private String userPassword;
	private String userImage;
	private Date userRegisteredDate;
}
