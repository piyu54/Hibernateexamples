package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class StudentDao {

	public void insertData() {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Student s = new Student();
		s.setStdName("piyu");
		s.setStdEmail("piyu@gmail.com");
		
		ss.persist(s);
		tr.commit();
		ss.close();
	}
	
	public void updateData()
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Student s= new Student();
		int id=0;
		
		Student s1=ss.get(Student.class,id);
		s1.setStdName("sakshi");
		
		ss.persist(s1);
		tr.commit();
		ss.close();
		
		
	}

	public void deleteData() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Student s= new Student();
		int id=0;
		
		Student s1=ss.get(Student.class,id);
		
		ss.remove(s1);
		
		tr.commit();
		ss.close();
		
		
		
	}
}
