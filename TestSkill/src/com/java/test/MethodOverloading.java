package com.java.test;

class TestOverloading {
	static int add(int a, int b) {
		return a + b;
	}

	static float add(float a, float b) {
		return a + b;
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		System.out.println(TestOverloading.add(11, 11));
		System.out.println(TestOverloading.add(11, 22));
	}
}
