package com.test.array;

import java.util.Arrays;

public class CountFreqArrayElement {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,1,1,2,3,2,5};
		boolean []booleanArray = new boolean[arr.length];
		Arrays.fill(booleanArray, false);
		// Traverse through array elements and 
	    // count frequencies 
	    for (int i = 0; i < arr.length; i++) { 
	  
	        // Skip this element if already processed 
	        if (booleanArray[i] == true) 
	            continue; 
	  
	        // Count frequency 
	        int count = 1; 
	        for (int j = i + 1; j < arr.length; j++) { 
	            if (arr[i] == arr[j]) { 
	            	booleanArray[j] = true; 
	                count++; 
	            } 
	        } 
	        System.out.println(arr[i] + " " + count); 
	    } 
	}

}
