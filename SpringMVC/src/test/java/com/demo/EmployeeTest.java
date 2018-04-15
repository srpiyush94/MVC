package com.demo;

import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee>
	{
		private int id;
		private String name;	
		public Employee(int id,String name)
		{
		this.id=id;
		this.name=name;
		}
		public String toString()
		{
		return "ID:"+id+"\tName:"+name;
		}
		public boolean equals(Object obj)
		{
		if(obj==this)
		return true;
		if(obj==null||obj.getClass()!=this.getClass())
		 return false;
		Employee e=(Employee)obj;
		if(id == e.id &&(name == e.name )|| (name != null && name.equals(e.name)))
			return true;
		return false;
		
		
		}

		public int hashCode()
		{
		int hash=7;
		hash=hash*31+id;
		hash = 31 * hash + (null == name? 0 :name.hashCode());
		return hash;
		}
		public int compareTo(Employee o) {
			// TODO Auto-generated method stub
			return 0;
		}
		



	}
   class EmployeeTest
{
		public static void main(String arg[])
		{
		Employee e1=new Employee(1,"piyush");
		Employee e2=new Employee(1,"piyush");
		
		Set<Employee> set=new TreeSet<Employee>();
		set.add(e1);
		set.add(e2);
		
		System.out.println(e1.equals(e2)+""+set);
		}
}