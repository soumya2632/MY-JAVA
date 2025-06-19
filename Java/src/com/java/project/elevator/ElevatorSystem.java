package com.java.project.elevator;
import java.util.Scanner;


public class ElevatorSystem {
		
	    public static void main(String[] args) {
	        Elevator elevator = new Elevator();
	        elevator.start();

	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Elevator started. Enter floor requests (0-10). Type 'exit' to quit.");

	        while (true) {
	            System.out.print("Enter Destination Floor: ");
	            String input = scanner.nextLine();

	            if (input.equalsIgnoreCase("exit")) {
	                System.out.println("Exiting system...");
	                System.exit(0);
	            }

	            try {
	                int floor = Integer.parseInt(input);
	                if (floor < 0 || floor > 10) {
	                    System.out.println("Invalid floor. Try again.");
	                    continue;
	                }
	                elevator.addRequest(floor);
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input. Please enter a number.");
	            }
	        }
	    }
	}

	


