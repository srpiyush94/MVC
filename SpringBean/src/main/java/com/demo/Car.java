package com.demo;

public class Car implements Vehicle {

	private String fuleType;
	private int maxSpeed;
	
	public String getFuleType() {
		return fuleType;
	}
	public void setFuleType(String fuleType) {
		this.fuleType = fuleType;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void move() {
	
		System.out.println("Fuel Type:"+fuleType);
		System.out.println("Max Speed:"+maxSpeed);
		
	}

}
