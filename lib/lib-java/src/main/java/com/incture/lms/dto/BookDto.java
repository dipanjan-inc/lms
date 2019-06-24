package com.incture.lms.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class BookDto {
private String bookCode;
	
	private String bookName;
	
	private String bookAuthor;
	
	private String bookdescription;
	
	private String bookImage;
	
	private String bookUrl;
	
	private Integer bookQuantity;
	
	private String bookAddedBy;
	
	private Date bookCreatedDate;
	
}
