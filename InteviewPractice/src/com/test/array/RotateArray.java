package com.test.array;

public class RotateArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int brr[] = {1,2,3,4,5,6,7};
		int d = 3;
		int diff = 3;
		int n = arr.length;
		
		for(int i=0;i<d;i++){
			int temp = arr[0],j;
			for(j=0;j<n-1;j++) {
				arr[j] = arr[j+1];
			}
			arr[j] = temp;
		}
		for(int j=0;j<n;j++){
		System.out.print(" "+arr[j]);
		}
		arr = rotLeft(brr, diff);
		System.out.println("----------------");
		for(int j=0;j<n;j++){
			System.out.print(" "+arr[j]);
			}
	}
	
	// Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
    	
    	for(int i=0;i<d;i++) {
    		int temp = a[0],j;
    		for(j=0;j<a.length-1;j++) {
    			a[j]=a[j+1];
    		}
    		a[j] = temp;
    	}
    	return a;

    }

}