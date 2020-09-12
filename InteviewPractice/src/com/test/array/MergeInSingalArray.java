package com.test.array;

public class MergeInSingalArray {
	public static void main(String[] args) {
		
	
	int a[] = new int[6];
	a[0] = 1;
	a[1] = 5;
	a[2] = 9;
	int[] b = {2,4,6};
	int m=3,n=3,i=0,j=0;
	int k = m-1;
	for(;k>=0;k--) {
		if(b[j] > a[i] || i<0) {
			a[k] = b[j];
			j--;
			if(j<0)
				break;
		}else {
			a[k] = a[i];
			i--;
		}
		
	}
	
	for(int q=0;q<a.length;q++) {
		System.out.println(a[q]);
	}
	
	
	}
}
