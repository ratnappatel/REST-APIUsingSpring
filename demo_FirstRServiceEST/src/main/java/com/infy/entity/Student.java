package com.infy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int rollno;
	private String name;
	private String address;
	private String mobileno;
	public Student() {
	}
	public Student(int rollno, String name, String address, String mobileno) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.mobileno = mobileno;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + ", mobileno=" + mobileno + "]";
	}
	
	

}
