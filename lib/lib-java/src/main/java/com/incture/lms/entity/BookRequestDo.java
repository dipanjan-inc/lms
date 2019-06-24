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
@Table(name = TableConfig.PACKAGE + "::LMS_ORDER_REQUEST")
@Getter
@Setter
@ToString
public class BookRequestDo {
	@Id
	@Column(name = "ORDER_REQUEST_CODE")
	private String orderRequestCode;

	@Column(name = "USER_CODE")
	private String userCode;

	@Column(name = "BOOK_CODE")
	private String bookCode;

	@Column(name = "IS_APPROVED")
	private String isApproved;

	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "ISSUED_TO")
	private Date issuedTo;

	@Column(name = "ISSUED_FROM")
	private Date issuedFrom;

	@Column(name = "REQUESTED_DATE")
	private Date requestedDate;
}
