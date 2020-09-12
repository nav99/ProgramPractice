package com.test.array;

import java.util.ArrayList;
import java.util.List;

public class MergeArrayInt {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(5);
		a.add(7);
		a.add(7);
		List<Integer> b = new ArrayList<>();
		b.add(0);
		b.add(1);
		b.add(2);
		b.add(3);
		mergeArrays(a, b);
		System.out.println("----->" + mergeArrays(a, b));

	}

	public static List<Integer> mergeArrays(List<Integer> a, List<Integer> b) {
		// Write your code here
		List<Integer> output = new ArrayList<>();

		int len1 = a.size();
		int len2 = b.size();
		int k=0;
		int i = 0;
		int j=0;
		while(i<len1 && j<len2) {
			if(a.get(i).compareTo(b.get(j))>0) {
				output.add(b.get(j));
				j++;
			}else {
				output.add(a.get(i));
				i++;
			}
			
		}
		// Store Remaining element of first array
		while(i < len1) {
			output.add(a.get(i));
			i++;
		}
		while (j<len2) {
			output.add(b.get(j));
			j++;
		}
	
		
		
		return output;

	}
}
