package com.test.array;

public class RearrangingDigitMinNo {
	
	 // function to find the smallest number 
    static int smallest(int num) 
    { 
        // initialize frequency of each digit to Zero 
        int[] freq = new int[10]; 
       
        // count frequency of each digit in the number 
        while (num > 0) 
        { 
            int d = num % 10; // extract last digit 
            freq[d] = freq[d] + 1; // increment counting 
            num = num / 10; //remove last digit 
        } 
       
        // Set the LEFTMOST digit to minimum expect 0 
        int result = 0; 
        for (int i = 1 ; i <= 9 ; i++) 
        { 
            if (freq[i] != 0) 
            { 
                result = i; 
                freq[i] = freq[i] - 1; 
                break; 
            } 
        } 
       
        // arrange all remaining digits 
        // in ascending order 
        for (int i = 0 ; i <= 9 ; i++) 
            while (freq[i]-- != 0) 
                result = result * 10 + i; 
       
        return result; 
    } 
       
    // Driver Program 
    public static void main(String args[]) 
    { 
        int num = 570107; 
        System.out.println(smallest(num)); 
    } 

}
