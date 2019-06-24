package com.incture.lms.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ResponseDto {
	private String status;
	private String message;
	private List<?> list;
}
