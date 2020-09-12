package com.test.array;

public class SecondHighestNumber {
	public static void main(String[] args) {
		int[] arr= {4,12,55,21,99,67,88};
		int firstHigh = arr[0];
		int secondHigh = arr[1];
		if(firstHigh < secondHigh) {
			secondHigh = firstHigh;
			firstHigh = arr[1];
		}
		for(int i=2; i<arr.length;i++) {
			if(firstHigh < arr[i]) {
				secondHigh = firstHigh;
				firstHigh = arr[i];
			}
			else if(arr[i] < firstHigh && arr[i] > secondHigh) {
				secondHigh = arr[i];
			}
		}
		System.out.println(firstHigh + " "+ secondHigh);
	}

}
