package com.java.test;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter String");
		Scanner sc =new Scanner(System.in);
		String inputString = sc.next();
		char[] ch=inputString.toCharArray();
		boolean flag = false;
		for(int i=0, j=ch.length - 1; i < ch.length/2 ;i++ , j--){
			if(ch[i] != ch[j]){
				flag = false;
				break;
			}
			else{
				flag = true;
				
			}
		}
		if(flag){
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");

	}

}
