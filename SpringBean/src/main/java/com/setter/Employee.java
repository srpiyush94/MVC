package com.setter;

public class Employee {
	
		private String name;
	    private int age;
	    private String employeeCode;
	    private String designation;
	    private Address address;
	 
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public int getAge() {
	        return age;
	    }
	    public void setAge(int age) {
	        this.age = age;
	    }
	    public String getEmployeeCode() {
	        return employeeCode;
	    }
	    public void setEmployeeCode(String employeeCode) {
	        this.employeeCode = employeeCode;
	    }
	    public String getDesignation() {
	        return designation;
	    }
	    public void setDesignation(String designation) {
	        this.designation = designation;
	    }
	    public Address getAddress() {
	        return address;
	    }
	    public void setAddress(Address address) {
	        this.address = address;
	    }
	    public void printEmployeeDetail(){
	 
	        System.out.println("Employee Name \t\t: " + name);
	        System.out.println("Employee Age \t\t: " + age);
	        System.out.println("Employee Code \t\t: " + employeeCode);
	        System.out.println("Employee Designation \t: " + designation);
	 
	        System.out.println("\nInvoking Address object & Printing Address details\n");
	        address.printAddressDetail();
	    }

}
