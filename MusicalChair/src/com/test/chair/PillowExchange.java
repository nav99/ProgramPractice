package com.test.chair;

import java.util.Scanner;

public class PillowExchange {

	public static void main(String[] args) {
		System.out.println("Enter the Number of Players:");
		Scanner input = new Scanner(System.in);
		int player = input.nextInt();
		System.out.println("Enter the length of  song:");
		int song = input.nextInt();
		System.out.println("Winner is: " + getwinner(player, song) + " number player ");
	}

	public static int getwinner(int player, int song) {
		int arr[] = new int[player + 1];
		int temp;
		for (int i = 1; i <= player; i++) {
			arr[i] = i;
		}
		for (int i = 1; i < player; i++) {
			for (int j = 1; j < song; j++) {
				temp = arr[1];

				for (int k = 1; k < arr.length - 1; k++) {
					arr[k] = arr[k + 1];
				}
				arr[arr.length - 1] = temp;
			}
			for (int a = 0; a < arr.length; a++) {
				if (a == 0) {
					int[] copy = new int[arr.length - 1];
					System.arraycopy(arr, 0, copy, 0, a);
					System.arraycopy(arr, a + 1, copy, a, arr.length - a - 1);
					arr = copy;
				}
			}

		}
		return arr[1];
	}

}
