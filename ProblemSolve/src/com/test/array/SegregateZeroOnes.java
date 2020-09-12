package com.test.array;

public class SegregateZeroOnes {
	
	public static void main(String[] args) {
		int[] arr = {1,1,0,0,0,1,0,0,1,1,1,1,0};
		int count = 0;
		for(int i=0 ; i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(i<count) {
				System.out.print("1" + " ");
			}else {
				System.out.print("0"+" ");
			}
		}
	}

}
