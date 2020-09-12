package com.test.array;

public class SegregateEvenOdd {
	public static void main(String[] args) {
		int[] arr = {2,18,5,4,7,9,10,11,15,12,77,99,33,11};
		int j=-1,temp;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				j++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] =temp;
			}
		}
		
		
		 
		 for (int i = 0; i < arr.length; i++) 
	            System.out.print(arr[i] + " "); 
	}
}
