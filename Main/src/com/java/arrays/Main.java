package com.java.arrays;

import java.util.Arrays;

public class Main {


	public static void main(String[] args) {
		
		int nums[] = new int[5];
		for(int i =0; i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		for(int num : nums) {//for each loop
			System.out.print(nums[num]+" ");
		}
		System.out.println();
		System.out.print(Arrays.toString(nums));
	}
 
}
