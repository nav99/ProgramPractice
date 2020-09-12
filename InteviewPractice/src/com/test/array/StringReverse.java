package com.test.array;

import java.util.Arrays;

public class StringReverse {
public static void main(String[] args) {
	String str = "abcde";
	char[] ch = str.toCharArray();
	int len = str.length()-1;
	for(int i=0,j=str.length()-1;i<=len/2;i++,j--) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}
	System.out.println(Arrays.toString(ch));
}
}
