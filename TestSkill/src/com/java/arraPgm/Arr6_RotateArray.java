package com.java.arraPgm;

public class Arr6_RotateArray {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7};
		int rotate = 2;
		arr = rotateArray(arr,rotate);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}

	private static int[] rotateArray(int[] arr, int rotate) {
		// TODO Auto-generated method stub
		int rotateIndex = rotate;
		int[] roated_array = new int[arr.length];
		int i=0;
		while(rotateIndex < arr.length){
			roated_array[i] = arr[rotateIndex];
			rotateIndex++;
			i++;
		}
		rotateIndex = 0;
		while(rotateIndex < rotate){
			roated_array[i] = arr[rotateIndex];
			i++;
			rotateIndex++;
		}
		return roated_array;
	}

}
