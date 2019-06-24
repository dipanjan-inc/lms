package com.incture.lms.dto;

import java.util.Date;
import com.incture.lms.util.JsonDateSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserReqBookDto {
	private String bookName;
	//@JsonSerialize(using=JsonDateSerializer.class)
	private Date requestedDate;
	private String requestCode;
	private String userName;
	private String userId;
	@JsonProperty(access=Access.WRITE_ONLY)
	private String userCode;
	@JsonProperty(access=Access.WRITE_ONLY)
	private String bookCode;
	private String isApproved;
	@JsonProperty(access=Access.WRITE_ONLY)
	private Date issuedTo;
	@JsonProperty(access=Access.WRITE_ONLY)
	private Date issuedFrom;
}
