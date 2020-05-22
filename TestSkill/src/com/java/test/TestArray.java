package com.java.test;

public class TestArray {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,2,5,6,2,9};
		int target=2,countTaget=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){
				shuffle(target,arr);
				countTaget++;
			}
		}
	}

	private static void shuffle(int i, int[] arr) {
		// TODO Auto-generated method stub
		for(int j=i;j<arr.length;j++){
			
			arr[j]=arr[j+1];
		}
		
	}
	

}
