package com.incture.lms.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.incture.lms.dao.BookDao;
import com.incture.lms.dto.BookDto;
import com.incture.lms.dto.ResponseDto;
import com.incture.lms.service.BookService;

public class BookServiceImpl implements BookService {
	
	@Autowired
	BookDao bookDao;

	@Override
	public ResponseDto saveBook(BookDto dto) {
		return bookDao.saveBooks(dto);
	}

	@Override
	public ResponseDto getBookList() {
		return bookDao.getBookList();
	}

}
