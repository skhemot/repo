package com.infosys.oops;

public class Student {

	
	private String studentName;
	
	private int age;
	
	private int rollNo;
	
	private String address;
	
	private long mobileNumber;
	
	//behaviour - method
	public void studying() {
		System.out.println("Student is studying");
	}
	
	public Student() {
		
	}

	public Student(String studentName, int age, int rollNo, String address, long mobileNumber) {
	
		this.studentName = studentName;
		this.age = age;
		this.rollNo = rollNo;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	
	
}
