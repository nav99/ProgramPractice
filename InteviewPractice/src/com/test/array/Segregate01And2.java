package com.test.array;

public class Segregate01And2 {
	public static void main(String[] args) {
		int[] arr= {1,0,1,2,0,0,0,2,1,0,2};
		int countZero = 0;
		int countOne=0;
		int index=0,j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				countZero++;
				
			}else if(arr[i] == 1) {
				countOne++;
			}
		}
		for(int i =0;i<arr.length-1;) {
			if(i<countZero) {
				arr[index++] = 0;
				i++;
				
			}else if(j<countOne) {
				arr[index++] = 1;
				i++;
				j++;
			}else {
				arr[index++] = 2;
				i++;
			}
		}
		
		for(int i =0 ; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
