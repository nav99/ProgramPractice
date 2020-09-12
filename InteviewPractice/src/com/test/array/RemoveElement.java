package com.test.array;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,2,5,2};
		int len = removeElement(arr,2);
		System.out.println("Length "+ len);

	}
	
	 public static int removeElement(int[] nums, int val) {
		 
		 int len = 0;
		 for(int i=0;i<nums.length;i++) {
			 if(nums[i]!=val) {
				 nums[len++] = nums[i];
			 }
		 }
		 return len;
	        
	    }

}
