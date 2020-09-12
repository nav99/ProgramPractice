package com.test.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SumTwoIndexTarget {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15, 20, 25, 30, 35, 40, 45};
		int target = 52;
		indexPrint(arr, target);
		sumOfTriplet(arr,target);
		
	}



	private static void sumOfTriplet(int[] arr, int sum) {
		// TODO Auto-generated method stub
		System.out.println("Print all triplet");
		int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
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



	private static void indexPrint(int[] arr, int sum) {
		// TODO Auto-generated method stub
	
		Map map = new HashMap();
		for (int i = 0; i < arr.length; i++) {
			int temp = sum - arr[i];
			if(map.containsKey(temp)) {
				System.out.println("Index is  " + map.get(temp) + " "+ i);
				System.out.println("Sum is  "+temp + " " + arr[i] );
				
			}
		
			map.put(arr[i], i);
		}

	}

}
