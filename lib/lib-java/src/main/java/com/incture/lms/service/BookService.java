package com.incture.lms.service;

import com.incture.lms.dto.BookDto;
import com.incture.lms.dto.ResponseDto;

public interface BookService {

	ResponseDto saveBook(BookDto dto);
	
	ResponseDto getBookList();
	
	
	
}
