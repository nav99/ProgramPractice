package com.java.test;

public class ExcelNotoColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(titleToNumber("AE"));

	}

	private static int titleToNumber(String string) {
		// TODO Auto-generated method stub
		int result = 0;
		for(int i=0;i<string.length();i++){
			result = result * 26;
			System.out.println(string.charAt(i) - 'A');
			result = result + string.charAt(i) - 'A' + 1;
		}
		return result;
	}

}
