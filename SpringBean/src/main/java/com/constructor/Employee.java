package com.constructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp_Details")
public class Employee {
	
	@Id
	@GeneratedValue
	private int empId;
	private String name;
    private int age;
    private String employeeCode;
    private String designation;
  
    public Employee()
    {}
	public Employee(int empId,String name, int age, String employeeCode, String designation) {
		
		this.empId=empId;
		this.name = name;
		this.age = age;
		this.employeeCode = employeeCode;
		this.designation = designation;
		
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", employeeCode=" + employeeCode + ", designation="
				+ designation +"empID:"+empId+ "]";
	}
 
}
