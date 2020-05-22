package com.java.arraPgm;

import java.util.Arrays;

public class Arr3_MiniAbsDiff {
	public static void main(String[] args) {
		int[] arr = {2,4,-2};
		int minAbsDiff = minimumAbsDiff(arr);
		System.out.println(minAbsDiff);
		
	}

	private static int minimumAbsDiff(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int minNo = Integer.MAX_VALUE;
		for(int i=0;i<arr.length - 1;i++){
			int currentAbsDiff = Math.abs(arr[i] - arr[i+1]);
			minNo = Math.min(currentAbsDiff, minNo);
		}
		return minNo;
	}
	
	

}
