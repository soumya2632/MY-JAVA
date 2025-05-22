package com.java.string.immutable;  //strings is in java.lang.String package

public class string {
	public static void main(String[]args) {
		
		
		 String str1 = new String("MISSION IMPOSSIBLE");//new object
		   String str2 = new String("MISSION IMPOSSIBLE");//new obj created so both str1 and str2 are 
		                                                  //different bcz new keyward create diff obj each time in heap memory
		   String str3 = "MISSION IMPOSSIBLE";
		   String str6 = " mission impossible";
		   String str4 = "Hey Me!";
		   
		   String str5 = str2.intern();
		   System.out.println(str1==str2);
		   
		   if(str3==str4) {
			   System.out.println("equel");
		   }else { 
			   System.out.println("unequel");
		   }
		   
		   int lenght = str1.length();
		   System.out.println(str1);
		   System.out.println("Length:"+lenght);
		   
		  String concat = str2.concat("  PROGRESS");
		   System.out.println(concat);
		   System.out.println(concat+"Hello");
		   
		   String trim = str3.trim();
		   System.out.println(str3);
		   System.out.println(trim);
		   
		   //upper case
		   String toUpperCase = str4.toUpperCase();
		   System.out.println(str4);
		   System.out.println(toUpperCase);
		   
		   //Lower case
		   str4= str4.toLowerCase();
		   System.out.println(str4);
		   System.out.println(str4);
		   
		 //equals
		   boolean equal= str1.equals(str3);
		  // System.out.println(str4);
		   System.out.println(equal);
		   
		   //equals egnore case
		   boolean equalIgnoreCase= str3.equalsIgnoreCase(str6);
		  //System.out.println(str3);
		   System.out.println(equalIgnoreCase);
		   
		   
		   //compare to
		   int compareTo = str3.compareTo(str6);
		  // System.out.println(str4);
		   System.out.println(compareTo);
		   
		   //start with 
		boolean  startWith = str1.startsWith("MISSION");
		   System.out.println(startWith);
		   
		   //endsWith
		   System.out.println(str2.endsWith("IMPOSSIBLE"));
		   
		   //substrings
		   System.out.println(str1.substring(0,5));
	}

}
