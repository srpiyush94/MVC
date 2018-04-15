package com.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import java.util.Map.Entry;

class Student 
{
	private int id;
	 private String name;
	 private double mark;
	public Student(int id, String name, double mark) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mark=" + mark + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		System.out.println("result for id:"+result);
		long temp;
		temp = Double.doubleToLongBits(mark);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		System.out.println("result for mark:"+result);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		System.out.println("result for name:"+result+"\t"+name.hashCode());
		
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null||getClass()!=obj.getClass())
			return false;
		
		Student other = (Student) obj;
		if (id != other.id||Double.doubleToLongBits(mark) != Double.doubleToLongBits(other.mark))
			return false;
		if (name == null||other.name!=null) {
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

}

public class StudentTest {
	public static void main(String[] args) {
	Student s1=new Student(10,"piyush",45.55);
	Student s2=new Student(10,"piyush",45.55);
	System.out.println(s1.equals(s2));
	
	Map<Student, String>map=new HashMap<Student, String>();
	map.put(s1, "s1");
	map.put(s2, "s2");

	Set<Map.Entry<Student,String>> entrySet=map.entrySet();
	
	for(Entry<Student, String> e:entrySet)
	{
		
System.out.println("key:"+e.getKey()+"\tValue:"+e.getValue());

		
	}
	
	
	
	}

}
