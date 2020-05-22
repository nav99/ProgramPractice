package com.java.arraPgm;

public class Arr4_AlternateCharDel {
	public static void main(String[] args) {
		String str="abc";
		int delCount=0;
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length() - 1;i++){
			if(str.charAt(i) == str.charAt(i + 1)){
				delCount += 1;
			}
		}
		System.out.println(delCount);
	}

}
