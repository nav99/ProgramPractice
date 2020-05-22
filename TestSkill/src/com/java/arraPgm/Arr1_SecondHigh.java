package com.java.arraPgm;

import java.util.Scanner;

public class Arr1_SecondHigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int length = sc.nextInt();
		int[] arr=new int[length];
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		int first=arr[0];
		int second = arr[1];
		if(first < second){
			first = arr[1];
			second=arr[0];
		}
		for(int i=2; i < arr.length ; i++){
			if(arr[i] > first){
				second = first;
				first = arr[i];
			}
			else if(arr[i] < first && arr[i] > second){
				second = arr[i];
			}
		}
		System.out.println(first + " "+ second);
				

	}

}
