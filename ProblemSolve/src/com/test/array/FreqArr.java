package com.test.array;

public class FreqArr {
	public static void main(String[] args) {
		int[] arr = {1,2,4,2,3,5,5,2,2,1};
		int num = 200145;
		int freq[] = new int[10];
		while(num > 0) {
			int  d = num%10;
			freq[d] = freq[d] + 1;
			num = num/10;
		}
		for(int i=0;i<10;i++) {
			if(freq[i] != 0) {
				System.out.println(i + " -> " +freq[i]);
			}
		}
		int result = 0;
		for(int i=1;i<=9;i++) {
			if(freq[i] != 0) {
				result = i;
				freq[i] = freq[i] - 1;
				break;
			}
		}
		// Set remaining digit
		for(int i=0;i<10;i++) {
			while(freq[i] !=0) {
				result = result*10 + i;
				freq[i]--;
			}
		}
		
		System.out.println(result);
		
		// max no
		
		
		
	}

}
