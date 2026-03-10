package com.controller;

import java.util.Scanner;

import com.entity.Student;
import com.service.StudentService;

public class Controller {

	public static void main(String[] args) {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an Student Name");
		s.setStdName(sc.nextLine());

		System.out.println("Enter an Student Email");
		s.setStdEmail(sc.nextLine());

		StudentService ser = new StudentService();

		ser.insertdata(s);
//		ss.updatedata();
//		ss.deletedata(s);
		sc.close();
	}
}
