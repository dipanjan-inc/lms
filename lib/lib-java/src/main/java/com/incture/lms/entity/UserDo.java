package com.incture.lms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.incture.lms.util.TableConfig;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name=TableConfig.PACKAGE+"::LMS_USER")
@Getter
@Setter
@ToString
public class UserDo { //"INC_LMS"."LWS::LMS_USER"
	@Id
	@Column(name="USER_CODE")
	private String userCode;
	@Column(name="USER_NAME")
	private String userName;
	@Column(name="USER_ID")
	private String userId;
	@Column(name="USER_EMAIL")
	private String userEmail;
	@Column(name="USER_PASSWORD")
	private String userPassword;
	@Column(name="USER_IMAGE")
	private String userImage;
	@Column(name="USER_REGISTERED_DATE")
	private Date userRegisteredDate;
	
}
