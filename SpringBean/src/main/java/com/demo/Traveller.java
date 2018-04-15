package com.demo;

public class Traveller
{
	Vehicle v;

	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}
	
	public void startjourny()
	{
		v.move();
		
	}

}
