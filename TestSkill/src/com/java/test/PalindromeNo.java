package com.java.test;

public class PalindromeNo {
	public static void main(String[] args) {
		int no =-12321;
		int save =no;
		int revNo =0;
		
		while(no > 0){
			int rem;
			rem = no%10;
			revNo = (revNo *10) + rem ;
			no /= 10;
		}
		if(save == revNo)
			System.out.println("Palindrome");
		else {
			System.out.println("Not Palindrome");
		}
	}

}
