package com.test.array;

import java.util.Arrays;

public class MergeArray {
	public static void sort(String[] arr) {
		int size = arr.length;
		for(int i=0;i<size-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String[] a = {"a","z","c","d","f","g"};
		String[] b = {"e","b","h"};
		sort(a);
		sort(b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		String[] c = new String[a.length + b.length];
		mergeArrays(a,b,c);
		System.out.println(Arrays.toString(c));
		
	}

	private static void mergeArrays(String[] a, String[] b, String[] c) {
		int len1 = a.length;
		int len2 = b.length;
		int k=0;
		int i = 0;
		int j=0;
		while(i<len1 && j<len2) {
			if(a[i].compareTo(b[j])>0) {
				c[k++] = b[j++];
			}else {
				c[k++] = a[i++];
			}
			
		}
		// Store Remaining element of first array
		while(i < len1) {
			c[k++] = a[i++];
		}
		while (j<len2) {
			c[k++] = b[j++];
		}
	}

}
