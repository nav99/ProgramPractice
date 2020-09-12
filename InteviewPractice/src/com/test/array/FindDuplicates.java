package com.test.array;

public class FindDuplicates {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 4,1};
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[Math.abs(arr[i])] > 0) {
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			} else {
				flag = false;
				System.out.print(Math.abs(arr[i]) + " ");
			}
		}
		if(flag) {
			System.out.println(" -1 ");
		}

	}

}
