package com.java.oops.constructor;

public class MainCar {
	public static void main(String...args) {
		
	       Car c1 = new Car();
	       System.out.println(c1.weight);
	       System.out.println(c1.details());
	       System.out.println(c1);
	       System.out.println(c1.hashCode());
	       c1.safetyRatings = 5;
	       System.out.println(c1.details());
	       
	       
	       Car c2 = new Car();
	       System.out.println(c1.weight);
	       System.out.println(c2.details());
	       System.out.println(c1);
	       System.out.println(c2.hashCode());
	       System.out.println(c2.safetyRatings = 10);
	       System.out.println(c2.details());
	       c1.safetyRatings = 5;
	       System.out.println(c1.details());
	       
	       Car c3 = null;
	       System.out.println(c3);
		
	}
	    

}
