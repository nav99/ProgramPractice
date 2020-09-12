package com.test.array;

public class EvenNoDigits {
	public static void main(String[] args) {
		
		int[] arr= {22,44,143,543,55443328,12,12,13,12,12,6677,898989,111};
		System.out.println(findNumbers(arr));
		
	}
	
	 public static int findNumbers(int[] nums) {
		 int count =0;
		 for(int num : nums) {
			 if(String.valueOf(num).length()%2==0) {
				 count++;
			 }
		 }
		
		 return count;
	    }

}
