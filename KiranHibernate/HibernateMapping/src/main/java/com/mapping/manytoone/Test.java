package com.mapping.manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Address.class);
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		
		Employee e1 = new Employee();
		e1.setEmpName("ram");
		e1.setEmpEmail("ram@gmail.com");

		Employee e2 = new Employee();
		e2.setEmpName("sachin");
		e2.setEmpEmail("sachin@gmail.com");

		Address ad= new Address();
		ad.setCity("nagpur");
		ad.setCountry("india");
		ad.setPincode(5664387);
		ad.setState("Mh");
		
		ss.persist(ad);
		
		e1.setAdd(ad);
		e2.setAdd(ad);
		
		ss.persist(e1);
		ss.persist(e2);
		tr.commit();
		ss.close();
		
		
		
		
	}
}
