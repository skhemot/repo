package com.infosys.oops;

public class Car extends Vehicle {

	private int noOfDoors;
	private boolean isElectric;
private int =1998;
private int a=2000;
//pim qa
	public Car() {
		super();
	}

	public Car(int noOfDoors, boolean isElectric) 
	{

		this.noOfDoors = noOfDoors;
		this.isElectric = isElectric;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public boolean isElectric() {
		return isElectric;
	}

	public void setElectric(boolean isElectric) {
		this.isElectric = isElectric;
	}

}
