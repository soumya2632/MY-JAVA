package com.java.oops.constructor;

public class Animals {

	String color;
	int Height;
	String voice;
	int Age;
	
	//-----OVERLOADING CONSTRUCTOR-----
	// constructor called
	Animals(){     // parameterless constructor
		System.out.println("Animals agr now ready");
	}
	Animals(String color, String voice){
		this();
		System.out.println("2 parameterized constructor");
	}
	// parameterized constructor
	Animals(String color, int Height, int Age, String voice){
		//this is a reference variable that return an object to itself
		this. color = color;
		this. Height = Height;
		this. voice = voice;
		 this.Age = Age; 
	}
	// clone of constructor i.e copy of constructor
	Animals(Animals An){
	 color = An.color;
	 Height = An.Height;
	 voice = An.voice;
	 Age = An.Age;
		
	}
	
	void dog() {
		System.out.println("Dog Constructor");
	}
	void cat(String color, int Height, int Age, String voice) {
		System.out.println("Cat Constructor");
	}
	String details() {
		return "Animals [Color = "+color+", Height = "+Height+", Age ="+Age+", voice ="+voice+"]";
	}

}
