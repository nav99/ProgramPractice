package com.java.arraPgm;

import java.util.Scanner;

public class Arr9_PalindromeString {
	public static void main(String[] args) {
		System.out.println("Ener String ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String fixed_String = "";
		for (char c : str.toCharArray()) {
			if (Character.isDigit(c) || Character.isLetter(c))
				fixed_String = fixed_String + c;
		}
		fixed_String = fixed_String.toLowerCase();
		char[] ch = fixed_String.toCharArray();
		boolean flag = false;
		int a_pointer = 0;
		int b_pointer = fixed_String.length() - 1;
	
		
		for(; a_pointer <= b_pointer ; a_pointer++ , b_pointer--){
			if(ch[a_pointer] == ch[b_pointer]){
				flag =true;
			}
			else{
				flag = false;
				break ;
			}
				
		}
		if(flag){
			System.out.println("Palindrome");
		}else
			System.out.println("Not Palindrome");

	}
}
