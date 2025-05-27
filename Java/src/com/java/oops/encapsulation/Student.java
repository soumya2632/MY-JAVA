package com.java.oops.encapsulation;

import java.time.LocalDate;

public class Student {
	
   
	private String name;
	int age;
	int id;
	private LocalDate dob; 
	String subject; 
	
	// ----------- final with instance variables -----------
//		Opt 1. assign a final variable directly her in the declaration
	final private Gender gender;
	
	////Getter method for private
	public LocalDate getDob() {
		return  dob;
	}
	/////setter method
	public void setDob(LocalDate dob) { 
		this.dob = dob;
	}
	
	public String getName() {
		return name;
	}
	/////setter method
	public void setName(String name) {
		this.name = name;
	}
	
	public Gender getGender() {
		return gender;
	}
	//public void setGender(Gender gender) {
		//this.gender = gender;
	//}
	
	 Student(String name, int age, int id, LocalDate dob, String subject,Gender gender){
		this.name = name;
		this.age = age;
		this.id = id;
		this .dob = dob; 
		this.subject = subject;
		this.gender = gender;
	}
	public String toString() {
		return "Student[NAME:  " + name + "  ,AGE:  "+ age + "  ,ID:  "+id + "  ,DOB:  "
	+ dob + ",  SUBJECT:  " + subject + " ,  GENDER :  "+gender+" ] ";   
	}
	

}
