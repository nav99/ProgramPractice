package com.test.array;

import java.util.Scanner;

public class ConsecutiveOnes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[20];
	/*	for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		*/
		int[] a= {1,1,0,0,0,1,1,1,0,1,1,1,1,1};
		
		System.out.println(maxConsecutiveOnes(a));
		
	}

	private static int maxConsecutiveOnes(int[] binaryNo) {
		// TODO Auto-generated method stub
		int max=0,currentOnes=0;
		for(int i=0;i<binaryNo.length;i++) {
			if(binaryNo[i] == 1) {
				currentOnes = currentOnes + 1;
				max = Math.max(max, currentOnes);
			}else {
				currentOnes = 0;
			}
		}
		
		return max;
	}

}
