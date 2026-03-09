package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Student;

public class StudentDao {

	public void insertData(Student s) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		String sqlquery="insert into student (stdName, stdEmail )values (:name,:email)";
		MutationQuery query=ss.createNativeMutationQuery(sqlquery);
		query.setParameter("name", s.getStdName());
		query.setParameter("email",s.getStdEmail());
		
		query.executeUpdate();

		System.out.println("Data is inserted...!");
		
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
		
		String hqlQuery="update Student set stdName=:stdName,stdEmail=:stdEmail where stdId=:stdId";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("stdId", s.getStdId());
		query.setParameter("stdName", s.getStdName());
		query.setParameter("stdEmail", s.getStdEmail());
		
		
		
		query.executeUpdate();

		System.out.println("Data is updated...!");
		
		
//		ss.persist(s1);
		tr.commit();
		ss.close();
		
		
	}

	public void deleteData(int id2) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		

		String hqlQuery = "delete from Student where stdId=:stdId";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("stdId", id2);
		query.executeUpdate();

		System.out.println("Data is deleted...!");
		
		tr.commit();
		ss.close();
		
		
		
	}
	
	public void fetchAllData()
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		String hqlQuery = "from Student";
		Query<Student> query = ss.createQuery(hqlQuery, Student.class);
		List<Student> list = query.getResultList();

		for (Student employee : list) {
			System.out.println(employee);
		}
		
		tr.commit();
		ss.close();

	}
	
	public void fetchsingleData(int id)
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		

		String hqlQuery1 = "from Student where stdId=: stdId";
		org.hibernate.query.Query<Student> query = ss.createQuery(hqlQuery1, Student.class);
		query.setParameter("stdId", id);
		Student e = query.uniqueResult();
		System.out.println(e);

		
		
//		String hqlQuery = "from Student where stdId =: stdId";
//		Query query1 = ss.createQuery(hqlQuery, Student.class);
//		query1.setParameter("stdId", id);
//		Student e1 = (Student) query1.getSingleResult();
//		System.out.println(e1);

		tr.commit();
		ss.close();
	}
	
	
}
