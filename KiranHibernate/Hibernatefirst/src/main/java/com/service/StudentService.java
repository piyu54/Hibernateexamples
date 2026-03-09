package com.service;

import com.dao.StudentDao;

public class StudentService {

	
	public void insertdata() {
		StudentDao dao = new StudentDao();
		dao.insertData();

	}
	
	public void updatedata()
	{
	StudentDao dao= new StudentDao();
	dao.updateData();
	
	}

	public void deletedata() {
		StudentDao dao= new StudentDao();
		dao.deleteData();
		
	}
	
}
