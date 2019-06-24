package com.incture.lms.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.modelmapper.ModelMapper;

import com.incture.lms.dto.BookDto;
import com.incture.lms.dto.ResponseDto;
import com.incture.lms.entity.BookDo;
import com.incture.lms.util.ServiceUtil;
import com.incture.lms.util.TableConfig;

public class BookDao extends BaseDao{

	public ResponseDto saveBooks(BookDto dto) {
		ResponseDto response = new ResponseDto();
		try{
			this.getSession().save(importBookDto(dto));
			response.setMessage("Success");
			response.setStatus("200");
			return response;
		}catch(Exception e){
			response.setMessage("Failed");
			response.setStatus("200");
			return response;
		}
		
	}

	private BookDo importBookDto(BookDto dto) {
		BookDo book = new BookDo();
		String bookCode = nextVal("\""+TableConfig.SCHEMA+"\"","\""+TableConfig.PACKAGE+"\\:\\:LMS_BOOK.BOOK_CODE\"");
		book.setBookCode(bookCode);
		book.setBookName(dto.getBookName());
		book.setBookAddedBy(dto.getBookAddedBy());
		book.setBookAuthor(dto.getBookAuthor());
		book.setBookCreatedDate(ServiceUtil.getTimestamp());
		book.setBookdescription(dto.getBookdescription());
		book.setBookImage(dto.getBookdescription());
		book.setBookUrl(dto.getBookUrl());
		book.setBookQuantity(1);
		return book;
	}

	public ResponseDto getBookList() {
		ResponseDto responseDto = new ResponseDto();
		Criteria criteria = this.getSession().createCriteria(BookDo.class);
		@SuppressWarnings("unchecked")
		List<BookDo> bookList = criteria.list();
		List<BookDto> dtoBookList = new ArrayList<BookDto>();
		for (BookDo bookDo : bookList) {
			dtoBookList.add(exportBookDto(bookDo));
		}
		responseDto.setMessage("Success");
		responseDto.setStatus("200");
		responseDto.setList(dtoBookList);
		return null;
	}

	private BookDto exportBookDto(BookDo bookDo) {
		return new ModelMapper().map(bookDo, BookDto.class);
	}

}
