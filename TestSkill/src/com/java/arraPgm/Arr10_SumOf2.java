package com.java.arraPgm;

import java.util.Scanner;

public class Arr10_SumOf2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter Elements in Array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int target;
		System.out.print("Enter Target Element");
		sc.nextLine();
		target = sc.nextInt();
		sc.close();
		int a_pointer = 0;
		int b_pointer = arr.length - 1;
		while (a_pointer <= b_pointer) {
			int sum = arr[a_pointer] + arr[b_pointer];
			if (sum > target) {
				b_pointer -= 1;
			} else if (sum < target) {
				a_pointer += 1;
			} else{
				System.out.println(a_pointer + " " + b_pointer);
				break;
			}
			
		}

	}

}
