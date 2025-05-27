package com.java.oops.encapsulation;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Student st = new Student("Soumya",23,77, LocalDate.of(2002,03,26),"CS", Gender.FEMALE);
           System.out.println(st);
           System.out.println(st.hashCode());
           System.out.println(st);
           st.setName("Soumya Pandey");
           st.getName();
           System.out.println(st);
           System.out.println(st.age);
          // System.out.println(st.getDob());//error bcz dob is private now apply setter getter
           st.setDob(LocalDate.of(2001,03,26));
           System.out.println(st);
          // st.setGender("FEMALE"); String will not take bcz gender is enum
          
           System.out.println(st.getGender());
         //  st.setGender(Gender.MALE); 
           System.out.println(st);
	}

}
 