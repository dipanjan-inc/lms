package com.incture.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incture.lms.dto.*;
import com.incture.lms.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@PostMapping(value="/save")
	public ResponseDto saveBook(BookDto dto){
		return bookService.saveBook(dto);
	}
	@GetMapping(value="/getAll")
	public ResponseDto getAllBook(){
		return bookService.getBookList();
	}
}
