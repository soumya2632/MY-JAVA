package com.java.oops.constructor;

public class Car {
	
	
	// instance variable = object
	double weight; //0.0
	String color; //null
	float mielage; //0.0
	int topSpeedInKmpr; //0
	int safetyRatings; //0
	
	
	//unparameterized constructor
	Car(){
		 System.out.println("Car Obj made");
	}
	void start() {
		System.out.println("Starting the car");
	}
	void accelerate() {
		System.out.println("Accelerating the car");
	}
	void stop(){
		System.out.println("Stopping the car");
	}
	String details() {
		return "Car [color=" + color +", Weight= "+ weight + ", Mielage= "+ mielage 
				+", topSpeedInkmpr= "+topSpeedInKmpr + ", SafetyRatings= "+safetyRatings+"]";
	}
	
	
}
