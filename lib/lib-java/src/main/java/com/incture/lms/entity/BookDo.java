package com.incture.lms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.incture.lms.util.TableConfig;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name=TableConfig.PACKAGE+"::LMS_BOOK")
@Getter
@Setter
@ToString
public class BookDo {
	@Id
	@Column(name="BOOK_CODE")
	private String bookCode;
	
	@Column(name="BOOK_NAME")
	private String bookName;
	
	@Column(name="BOOK_AUTHOR")
	private String bookAuthor;
	
	@Column(name="BOOK_DESCRIPTION")
	private String bookdescription;
	
	@Column(name="BOOK_IMAGE")
	private String bookImage;
	
	@Column(name="BOOK_URL")
	private String bookUrl;
	
	@Column(name="BOOK_QUANTITY")
	private Integer bookQuantity;
	
	@Column(name="BOOK_ADDED_BY")
	private String bookAddedBy;
	
	@Column(name="BOOK_CREATED_DATE")
	private Date bookCreatedDate;
	
}
