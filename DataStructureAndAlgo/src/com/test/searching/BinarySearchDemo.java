package com.test.searching;

public class BinarySearchDemo {
	public static void main(String[] args) {
		int[] a = {1,5,6,8,9,10,12,15,16,18};
		System.out.println("---------");
		int i = binarySearch(a,6);
		System.out.println("Index is "+ i + " Data is "+ a[i]);
	}

	private static int binarySearch(int[] a, int data) {
		// TODO Auto-generated method stub
		int low = 0, high = a.length - 1;
		while(low <= high) {
			int mid = low + (high-low)/ 2;
			if(a[mid] == data) {
				return mid;
			}else if(a[mid] < data ) {
				low = mid+1;
			}else {
				high = mid - 1;
			}
		}
		
		
		return  -1;
	}

}
