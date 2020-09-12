package com.test.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fizzBuzz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int no = sc.nextInt();
		System.out.println(fizzBuzz(no));

	}

	private static List<String> fizzBuzz(int no) {
		// TODO Auto-generated method stub
		List<String> result = new ArrayList<>();
		for (int i = 1; i <= no; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				result.add("FizzBuzz");
			} else if (i % 3 == 0) {
				result.add("Fizz");
			} else if (i % 5 == 0) {
				result.add("Buzz");
			} else {
				result.add(Integer.toString(i));
			}
		}

		return result;
	}
}
