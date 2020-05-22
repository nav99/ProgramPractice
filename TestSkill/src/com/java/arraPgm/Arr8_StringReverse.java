package com.java.arraPgm;

import java.util.Scanner;

public class Arr8_StringReverse {
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		String save = str;
		char[] ch = str.toCharArray();
		int a_pointer = 0;
		int b_pointer = str.length() - 1;
		while(a_pointer <= b_pointer){
			char temp = ch[a_pointer];
			ch[a_pointer] = ch[b_pointer];
			ch[b_pointer] = temp;
			a_pointer += 1;
			b_pointer -= 1;
		}
		str  = String.valueOf(ch);
		System.out.println(str);
	}

}
