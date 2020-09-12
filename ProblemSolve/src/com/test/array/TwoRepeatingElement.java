package com.test.array;

public class TwoRepeatingElement {
	public static void main(String[] args) {
		int[] arr = {1,2,4,3,5,2,4};
		int[] count = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(count[arr[i]] == 1) {
				System.out.println(arr[i]);
			}else {
				count[arr[i]] = count[arr[i]] + 1;
			}
		}
	}

}
