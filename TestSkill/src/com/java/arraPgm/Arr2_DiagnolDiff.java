package com.java.arraPgm;

import java.util.Scanner;

public class Arr2_DiagnolDiff {
	public static void main(String[] args) {
		System.out.println("Enter Matrix Size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[][] arr = new int[size][size];
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		int sumOfLeft=0, sumOfRight = 0;
		int rows = arr.length;
		int col = arr[0].length;
		int i=0,j=0,k=0,l=arr.length-1;
		while(i <rows && j<col && k<rows && l>=0){
			sumOfLeft =sumOfLeft + arr[i][j];
			sumOfRight = sumOfRight + arr[k][l];
			i =i+1;
			j=j+1;
			k=k+1;
			l=l-1;
		}
		System.out.println(Math.abs(sumOfLeft - sumOfRight) );
	}
}
