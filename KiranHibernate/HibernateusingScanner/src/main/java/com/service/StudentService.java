package com.service;

import com.dao.StudentDao;
import com.entity.Student;

public class StudentService {

	public void insertdata(Student s) {
		StudentDao dao = new StudentDao();
		dao.insertData(s);

	}

	public void updatedata(Student s) {
		StudentDao dao = new StudentDao();
		dao.updateData(s);

	}

	public void deletedata(Student s) {
		StudentDao dao = new StudentDao();
		dao.deleteData(s);

	}

}
