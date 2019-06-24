package com.incture.lms.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.incture.lms.dto.BookRequestDto;
import com.incture.lms.dto.ResponseDto;
import com.incture.lms.service.AdminService;

public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminDao adminDao;
	@Override
	public ResponseDto getAllRequestedBook() {
		// TODO Auto-generated method stub
		return adminDao.getAllRequestedBook();
	}

	@Override
	public ResponseDto assignBooks(BookRequestDto dto) {
		return adminDao.assignBooks(dto);
	}

}
