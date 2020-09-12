package com.test.array;

import java.util.HashMap;
import java.util.Map;

public class ReturnIndexOfSum {
	public static void main(String[] args) {
		int[] arr = {1,12,15,20,30,25,7};
		int target = 21;
		printIndexSumOFTwoElement(arr,target);
	}

	private static void printIndexSumOFTwoElement(int[] arr, int target) {
		// TODO Auto-generated method stub
		int sum;
		Map map  = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
		
			sum = target - arr[i];
			if(map.containsKey(sum)) {
				System.out.println(map.get(sum) + " " + i);
				break;
			}else {
				map.put(arr[i], i);
			}
		}
		
		
		
	}

	

}
