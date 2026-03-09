package com.controller;

import com.service.StudentService;

public class Controller {

	public static void main(String[] args) {
		
		StudentService ss=new StudentService();
//		ss.insertdata();
//		ss.updatedata();
		ss.deletedata();
	}
}
