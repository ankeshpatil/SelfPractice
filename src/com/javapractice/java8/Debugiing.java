package com.javapractice.java8;

public class Debugiing {
	
	    public static void runningSum(int[] nums) {
	       int l=nums.length;
	       int b[]=new int[l];
	       int temp=0;
	        for(int i=0;i<nums.length;i++){
	        	 
	            b[i]=nums[i]+temp;
	            temp=b[i];
	        }
	        for(int z:b) {
	        	System.out.println(z);
	        }
	        
	    }
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		Debugiing.runningSum(a);
	}

}
