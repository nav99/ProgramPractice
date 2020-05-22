package com.java.test;

public class ReverseNegativeNo {
	public static void main(String[] args) {
		int no = -0237;
		int revNo = 0;
		while(no !=0){
			int rem = 0;
			rem =no%10;
			revNo = (revNo * 10) + rem;
			no /= 10;
		}
		System.out.println(revNo);
	}

}
