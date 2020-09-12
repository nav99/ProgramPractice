package com.test.array;

import java.util.Arrays;
import java.util.HashSet;

public class TripletSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,1,5,4};
		int n = 9;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	//	sumOfTriplet(arr,n);
		findTriplets(arr,n);
	}

/*
	private static boolean sumOfTriplet(int[] arr, int sum) {
		int left, right;
		for(int i=0;i<arr.length - 2; i++) {
			left = i + 1;
			right = arr.length - 1;
			while(left < right) {
				if(arr[i] + arr[left] + arr[right] == sum) {
					System.out.println("Triplet is "+ arr[i] + " " + arr[left] + " " + arr[right]);
					return true;
				}else if(arr[i] + arr[left] + arr[right] < sum) {
					left++;
				}else {
					right--;
				}
				
			}
		}
		
		return false;
	}
*/	
	static void findTriplets(int arr[],int sum) 
    { 
		System.out.println("Print all triplet");
		int n = arr.length;
        for (int i = 0; i < n - 1; i++) { 
            // Find all pairs with sum equals to 
            // "sum-arr[i]" 
            HashSet<Integer> s = new HashSet<>(); 
            for (int j = i + 1; j < n; j++) { 
                int x = sum - (arr[i] + arr[j]); 
                if (s.contains(x)) 
                    System.out.printf( 
                        "%d %d %d\n", x, arr[i], arr[j]); 
                else
                    s.add(arr[j]); 
            } 
        } 
    } 

}
