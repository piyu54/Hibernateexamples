package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class StudentDao {

	public void insertData(Student s) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		
		
		ss.persist(s);
		tr.commit();
		ss.close();
	}
	
	public void updateData(Student s)
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		
		int id=1;
		
		Student s1=ss.get(Student.class,id);
		s1.setStdName("sakshi");
		
		ss.persist(s1);
		tr.commit();
		ss.close();
		
		
	}

	public void deleteData(Student s) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		
		int id=1;
		
		Student s1=ss.get(Student.class,id);
		
		ss.remove(s1);
		
		tr.commit();
		ss.close();
		
		
		
	}
}
