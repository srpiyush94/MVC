package com.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.constructor.Address;
import com.constructor.Employee;

public class QueryExample {

	public static void main(String[] args) {
		 Configuration cfg = new Configuration().configure("hibernate.cfg.xml"); 
		 SessionFactory factory = cfg.buildSessionFactory();
		 Session session = factory.openSession();
		 Query qry=session.createQuery("from Employee");

			Transaction tx=session.beginTransaction();//Trans
		 	List<Employee> list=(List<Employee>)qry.list();
		 	Iterator<Employee> i=list.iterator();
		 	while(i.hasNext())
		 	{
		 		Employee e=(Employee)i.next();
		 		System.out.println(e);
		 	}
		 	System.out.println("list of employee  using for loop \n");
		 	for(Employee emp:list)
		 	{
		 		
		 		System.out.println(emp);
		 		
		 	}
		 		
		 		
		 		
		 	tx.commit();
		
	}

}
