package com.incture.lms.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incture.lms.dto.BookRequestDto;
import com.incture.lms.dto.ResponseDto;
@RestController
@RequestMapping(value="/bookRequest")
public class BookRequestController {
	
	
	@PostMapping
	public ResponseDto requestBook(BookRequestDto dto){
		return null;
		
	}
}
