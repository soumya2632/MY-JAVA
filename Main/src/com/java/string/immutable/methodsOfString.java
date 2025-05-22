package com.java.string.immutable;

public class methodsOfString {
	
     public static void main(String...args) {
	 
    	 String str = "   Hey! This is eclips  ";
    	 System.out.println(str);
    	 
    	 System.out.println("Length:"+str.length());
    	 System.out.println("CharAt:"+str.charAt(5));
    	 //contains 
    	// System.out.println("Contains Hey!?:"+str.contains("Hey!"));
    	 boolean contains = str.contains("!");
    	 System.out.println("contains:"+contains);
    	 
    	 //str","
    	 System.out.println("isEmpty:"+str.isEmpty());
    	 //trim
    	 System.out.println("Trim:"+str.trim());
    	 //index start end
    	// System.out.println("indexOfStart:"+str.indexOf('s'));
    	 int indexOfStart = str.indexOf('i');
    	 System.out.println("indexOfStart:"+indexOfStart);
    	 System.out.println("indexOfEnds:"+str.lastIndexOf('s'));
    	 //ISSIO
    	 //start, end-1
    	// System.out.println("SubString:"+str.substring(2,6));//OR
    	 String subString = str.substring(0,10);
    	 System.out.println("SubString:"+subString);
    	 //toUpperCase
    	 System.out.println("toUpperCase:"+str.toUpperCase());
    	 //concate
    	// System.out.println("concat:"+str.concat(", and i am going to code"));
    	 String concat = str.concat(", and i am going to code");
    	// System.out.println(concat+"!!!");or
    	 concat = concat+" !!! ";
    	// System.out.println(concat);
    	  concat += concat+"#@";
    	 System.out.println(concat);
 }
}
