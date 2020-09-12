package com.test.array;

public class EvenOIndex {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int index =0;
		for(int i=0;i<arr.length;) {
			arr[index++] = arr[i];
			i = i+2;
		}
		for(int i=0;i<index;i++) {
			System.out.println(arr[i]);
		}
	}

}
