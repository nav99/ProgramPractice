package com.test.array;

import java.util.ArrayList;

/*
 * Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
 */

public class MergeSortedArray {
	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3,0,0,0 };
		int[] nums2 = { 2, 5, 6 };
		int m = 3, n = 3;
		merge(nums1, m, nums2, n);
		for(int i=0;i<nums1.length;i++) {
			System.out.print(nums1[i] + " ");
		}

	}
//First Method
	/*
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int  = m + n -1;
		--m;
		--n;
		while(m>=0 && n>=0) {
			if(nums1[m] > nums2[n]) {
				nums1[--] = nums1[m--];
			}else {
				nums1[--] = nums2[n--];
			}
		}
		while(n>=0) {
			nums1[--] = nums2[n--];
		}
		
	}
*/
// Second Method
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int first = m-1;
		int second = n-1;
		for(int  i= m+n-1;i>=0;i--) {
			if(second <0) {
				break;
			}
			if(nums1[first] > nums2[second] ) {
				nums1[i] =nums1[first];
				first--;
			}
			else
			{
				nums1[i] =nums2[second];
				second--;
			}
		}
	}
	
}
