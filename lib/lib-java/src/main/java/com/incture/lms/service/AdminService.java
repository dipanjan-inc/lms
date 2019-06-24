package com.incture.lms.service;

import com.incture.lms.dto.BookRequestDto;
import com.incture.lms.dto.ResponseDto;

public interface AdminService {

	ResponseDto getAllRequestedBook();
	
	ResponseDto assignBooks(BookRequestDto dto);
}
