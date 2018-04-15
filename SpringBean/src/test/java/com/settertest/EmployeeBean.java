package com.settertest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.setter.Employee;

public class EmployeeBean {

	public static void main(String[] args) {
		
@SuppressWarnings("resource")
ApplicationContext 	context=new ClassPathXmlApplicationContext("beans.xml");
Employee emp=(Employee) context.getBean("employee");
emp.printEmployeeDetail();



		
	}
	
	
}
