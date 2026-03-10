package com.service;

import com.dao.StudentDao;
import com.entity.Student;

public class StudentService {

	
	public void insertdata(Student s) {
		StudentDao dao = new StudentDao();
		dao.insertData(s);

	}
	
	public void updatedata(Student s)
	{
	StudentDao dao= new StudentDao();
	dao.updateData(s);
	
	}

	public void deletedata(int id2) {
		StudentDao dao= new StudentDao();
		dao.deleteData(id2);
		
	}
	public void getalldata()
	{
		StudentDao dao= new StudentDao();
		dao.fetchAllData();
	}
	
	public void getsingledata(int id)
	{
		StudentDao dao= new StudentDao();
		dao.fetchsingleData(id);
	}
	
}
