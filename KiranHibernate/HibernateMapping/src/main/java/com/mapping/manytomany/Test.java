package com.mapping.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mapping.manytoone.Address;
import com.mapping.manytoone.Employee;

public class Test {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Address.class);
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		User user1= new User();
		user1.setName("mohit");
		user1.setEmail("mohit@gmail.com");
		
		User user2= new User();
		user2.setName("ajay");
		user2.setEmail("ajay@gmail.com");
		
		Nominee nominee1= new Nominee();
		nominee1.setName("Sagar");
		
		Nominee nominee2= new Nominee();
		nominee2.setName("Santosh");
		
		Nominee nominee3= new Nominee();
		nominee3.setName("madan");
		
		user1.getNomineeList().add(nominee1);
		user1.getNomineeList().add(nominee2);
		user1.getNomineeList().add(nominee3);
		
		nominee1.getUserList().add(user1);
		nominee2.getUserList().add(user1);
		nominee3.getUserList().add(user1);
		
		user2.getNomineeList().add(nominee2);
		user2.getNomineeList().add(nominee3);
		
		nominee2.getUserList().add(user2);
		nominee3.getUserList().add(user2);
		
		ss.persist(user1);
		ss.persist(user2);
		ss.persist(nominee1);
		ss.persist(nominee2);
		ss.persist(nominee3);
		
		tr.commit();
		ss.close();
		

	}
}
