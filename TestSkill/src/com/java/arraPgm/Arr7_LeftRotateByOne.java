package com.java.arraPgm;

class Arr7_LeftRotateByOne {
	// Driver program to test above functions
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int rotateBy = 2;
		arr = leftRotate(arr, rotateBy);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}

	private static int[] leftRotate(int[] arr, int rotateBy) {
		// TODO Auto-generated method stub
		for (int i = 0; i < rotateBy; i++) {
			leftRotateByOne(arr);
		}
		return arr;
	}

	private static void leftRotateByOne(int[] arr) {
		// TODO Auto-generated method stub
		int i, temp = arr[0];
		for (i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;
	}
}