package com.test.array;

public class SegregateEvenAndOddNo {
	public static void main(String[] args) {
		int[] arr = {2,45,32,12,9,30,20,15,18,27,3};
		int evenN0 = 0;
		int oddNo = arr.length -1;
		while(evenN0<oddNo) {
			if(arr[evenN0]%2!=0) {
				int temp = arr[evenN0];
				arr[evenN0] = arr[oddNo];
				arr[oddNo] = temp;
				oddNo--;
			}
			else {
				evenN0++;
			}
		}
		for(int i=0;i<arr.length;i++)
		System.out.print( arr[i] + " ");
	}

}
