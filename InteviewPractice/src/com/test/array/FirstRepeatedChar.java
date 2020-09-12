package com.test.array;

public class FirstRepeatedChar {
	public static void main(String[] args) {
		String str = "navneet";
	
		char[] ch = str.toCharArray();
		int[] count = new int[26];
		
		for(int i=0;i<ch.length;i++) {
			if(count[ch[i] - 'a'] == 1) {
				System.out.println(ch[i]);
				break;
			}else {
				count[ch[i] - 'a'] = 1;
		
			}
		}
	}

}
