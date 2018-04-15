package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.constructor.Address;

public class HDemo {

	public static void main(String[] args) {
	
		Address address=new Address(3, "sec" ,"HYD", "AP", "50140");
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml"); 
		 
		 SessionFactory factory = cfg.buildSessionFactory();
		 Session session = factory.openSession();
		
		Transaction tx=session.beginTransaction();//Transtraction start here
		session.save(address);
		tx.commit();//end here 
		System.out.println("Address has be persisted");
		
		
		
	}

}
