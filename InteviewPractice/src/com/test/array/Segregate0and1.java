package com.test.array;

public class Segregate0and1 {
	public static void main(String[] args) {
		int[] arr = {1,0,1,0,1,1,1,0,0,0,0};
		int[] brr = {0,0,1,1,1,0,0,1,1,1,0,0,1,0,1};
		int count = 0, j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count++;
			}
		}
		for(int i=0;i<count;i++) {
			arr[j++] = 0;
		}
		for(;j<arr.length;j++) {
			arr[j] = 1;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("-------------------");
		
		int x = 0; 
        int y = brr.length - 1; 
          
        while (x < y) { 
            if (brr[x] == 1) { 
                // swap 
            	int temp = brr[x];
            	brr[x] = brr[y];
            	brr[y] = temp;
            	
                y--; 
            } else { 
                x++; 
            } 
        } 
        
        for(int i=0;i<brr.length;i++) {
        	System.out.print(brr[i] + " ");
        }
		
		
	}

}
