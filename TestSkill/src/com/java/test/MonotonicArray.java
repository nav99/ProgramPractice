package com.java.test;

public class MonotonicArray {
	public static void main(String[] args) {
		int arr[]={5,4,3,2,44,1};
		System.out.println(isMonotonic(arr));
	}

	private static boolean isMonotonic(int[] arr) {
		// TODO Auto-generated method stub
		boolean increasing=true;
		boolean decreasing=true;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i] > arr[i+1]) increasing =false;
			if(arr[i] < arr[i+1]) decreasing=false;
			
		}
		if(increasing) return true;
		if(decreasing) return true;
		
		return false;
	}
	
}
