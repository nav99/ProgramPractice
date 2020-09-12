package com.test.array;

public class RemoveElementSortedArray {
	public static void main(String[] args) {
		int[] arr = {0,0,1,1,1,2,2,2,3,3,4};
		int[] arr1= {1,1,2};
		int len = removeDuplicates(arr1);
		System.out.println(len);
		
	}
	 public static int removeDuplicates(int[] nums) {
		 int len=1;
		 for(int i=0;i<nums.length-1;i++) {
			 if(nums[i] != nums[i+1]) {
				 nums[len++] = nums[i+1];
			 }
		 }
	        
		 return len;
	    }
}
