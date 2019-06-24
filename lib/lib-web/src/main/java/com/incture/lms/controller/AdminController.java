package com.incture.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incture.lms.dto.ResponseDto;
import com.incture.lms.service.AdminService;
@RestController
@RequestMapping(value="/admin")
public class AdminController {
	@Autowired
	AdminService adminService; 
	@GetMapping(value="/getAllRequestedBook")
	public ResponseDto getAllRequestedBook(){
		return adminService.getAllRequestedBook();
	}
}
