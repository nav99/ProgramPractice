package com.test.array;

public class RepeatElementTwice {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,4,5};
		int n =5;
		int count[] = new int[arr.length];
	
        for (int i = 0; i < arr.length; i++)  
        { 
            if (count[arr[i]] == 1) 
                System.out.print(arr[i] + " "); 
            else
                count[arr[i]] = count[arr[i]] + 1; 
        } 
        System.out.println();
        printRepeating(arr,arr.length);
	}
	
	
	static void printRepeating(int arr[], int size) 
    { 
        int i;   
        System.out.println("The repeating elements are : "); 
     
        for(i = 0; i < size; i++) 
        { 
            if(arr[Math.abs(arr[i])] > 0) {
            	arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            }
            else
                System.out.print(Math.abs(arr[i]) + " "); 
        }          
    }  

}
