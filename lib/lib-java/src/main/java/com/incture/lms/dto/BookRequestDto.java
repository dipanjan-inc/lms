package com.incture.lms.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookRequestDto {
	private String orderRequestCode;
	private String userCode;
	private String bookCode;
	private String isApproved;
	private String status;
	private Date issuedTo;
	private Date issuedFrom;
	private Date requestedDate;
	
}
