package com.controller;

import java.util.Scanner;

import com.entity.Student;
import com.service.StudentService;

public class Controller {

	public static void main(String[] args) {
		StudentService ss=new StudentService();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("1.Insert Data ");
		System.out.println("2.Fetch Single Data");
		System.out.println("3.Fetch All Data");
		System.out.println("4.Delete Data");
		System.out.println("5.Update Data");
		
		int choice = sc.nextInt();
		
		switch(choice)
		{
		
		case 1:
			sc.nextLine();
			Student std= new Student();
			System.out.println("Enter an Student Name");
			std.setStdName(sc.nextLine());
			
			System.out.println("Enter an Student Email");
			std.setStdEmail(sc.nextLine());
			
			ss.insertdata(std);
			break;
			
		case 2:
			
			System.out.println("Enter an Student Id ");
			int id=sc.nextInt();
			ss.getsingledata(id);
			break;
		
		case 3:
			ss.getalldata();
			break;
		
		case 4:
			
			System.out.println("Enter an Student Id ");
			int id2=sc.nextInt();
			ss.deletedata(id2);
			break;
			
		case 5:
			Student std3= new Student();
			System.out.println("Enter an Student Id to update");
			std3.setStdId(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter an Student Name");
			std3.setStdName(sc.nextLine());
			System.out.println("Enter an Student Email");
			std3.setStdEmail(sc.nextLine());
			ss.updatedata(std3);
			break;
			
		default:
			System.out.println("Invaild");
			
		}
		
		sc.close();



	}
}
