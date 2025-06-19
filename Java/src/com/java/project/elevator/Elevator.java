package com.java.project.elevator;
import java.util.*;

	public class Elevator extends Thread {
	    private int currentFloor = 0;
	    private final TreeSet<Integer> requests = new TreeSet<>();
	    private boolean goingUp = true;

	    public synchronized void addRequest(int floor) {
	        requests.add(floor);
	        notify(); // Wake up the elevator thread if it's waiting
	    }

	    @Override
	    public void run() {
	        while (true) {
	            Integer nextFloor = getNextRequest();

	            if (nextFloor != null) {
	                moveToFloor(nextFloor);
	                stopAtFloor();
	            } else {
	                waitForRequests();
	            }
	        }
	    }

	    private synchronized Integer getNextRequest() {
	        if (requests.isEmpty()) return null;

	        if (goingUp) {
	            for (int floor : requests) {
	                if (floor >= currentFloor) return floor;
	            }
	            goingUp = false; // Change direction if no upper floors
	            return getNextRequest();
	        } else {
	            for (Iterator<Integer> it = requests.descendingIterator(); it.hasNext(); ) {
	                int floor = it.next();
	                if (floor <= currentFloor) return floor;
	            }
	            goingUp = true; // Change direction if no lower floors
	            return getNextRequest();
	        }
	    }

	    private void moveToFloor(int floor) {
	        System.out.println("Moving from Floor " + currentFloor + " to Floor " + floor);
	        while (currentFloor != floor) {
	            if (floor > currentFloor) currentFloor++;
	            else currentFloor--;
	            System.out.println("_________________");
	            System.out.println("Going Up at Floor: " + currentFloor);
	            try {
	                Thread.sleep(1000); // Simulate movement delay
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	    private synchronized void stopAtFloor() {
	        System.out.println("You Destination  " + currentFloor + " floor has come, now you can go.");
	        requests.remove(currentFloor);
	        try {
	            Thread.sleep(2000); // Stop at floor
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

	    private synchronized void waitForRequests() {
	        try {
	            System.out.println("No requests. Waiting...");
	            wait();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}

	



