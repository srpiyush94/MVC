package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.constructor.Employee;

public class AnnotationDemo {

	public static void main(String[] args) {
		Configuration cfg= new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory =cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Employee e= new Employee(2,"piyush", 26,"emp11", "IT_PROG");
		session.save(e);
		Transaction tx=session.beginTransaction();
		tx.commit();
		System.out.println("Employee object stored");

	}

}
