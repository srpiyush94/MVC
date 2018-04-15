package com.constructortest;
 
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.constructor.Employee;
	 
	public class TestEmployee {
	 
	    public static void main(String[] args) {
	        testApplicationContext();
	    }
	 
	    private static void testApplicationContext(){
	 
	        @SuppressWarnings("resource")
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
	        Employee employee = (Employee) applicationContext.getBean("employee");
	 
	        System.out.println("Spring Application Demo using ApplicationContext\n");
	        System.out.println(employee);
	    
	    }
	}