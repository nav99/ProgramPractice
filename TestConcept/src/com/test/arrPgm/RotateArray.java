package com.test.arrPgm;

public class RotateArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int d = 3;
		int n = arr.length;
		
		for(int i=0;i<d;i++){
			int temp = arr[0],j;
			for(j=0;j<n-1;j++){
				arr[j] = arr[j+1];
			}
			arr[j] = temp;
		}
		for(int j=0;j<n;j++){
		System.out.print(" "+arr[j]);
		}
	}

}
