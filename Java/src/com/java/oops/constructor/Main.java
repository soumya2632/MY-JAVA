package com.java.oops.constructor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animals A = new Animals("Golden",45,14,"Bark" );
		System.out.println(A.color);
		System.out.println(A.details());
		A.color = "Black";
		A.voice = "meoww";
		System.out.println(A.details());
		
		 Animals A2 = new Animals(A);
		 System.out.println(A2.details());

	}

}
