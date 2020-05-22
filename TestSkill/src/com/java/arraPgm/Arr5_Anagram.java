package com.java.arraPgm;


// Make Anagram - How many element need to delete
public class Arr5_Anagram {
	public static void main(String[] args) {
		String str1 = "abcz";
		String str2 = "zcrtab";
		int minDel=0;
		int[] a_freq = new int[26];
		int[] b_freq = new int[26];
		for(int i=0;i<str1.length();i++){
			char current_char = str1.charAt(i);
			int char_to_int = (int)current_char;
			int position = char_to_int - 97;
			a_freq[position]++;
		}
		for(int i=0;i<str2.length();i++){
			char current_char = str2.charAt(i);
			int char_to_int = (int) current_char;
			int position = char_to_int - 97;
			b_freq[position]++ ; 
		}
		for(int i=0;i<26;i++){
			int diffrence = Math.abs(a_freq[i] - b_freq[i]);
			minDel = minDel + diffrence;
		}
		System.out.println(minDel);
		
	}

}
