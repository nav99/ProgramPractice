package com.java.test;



//Java program to find the frequency of 
//minimum element in the array 
import java.io.*;
import java.util.ArrayList; 

class MinFreqMinValue  
{ 
   
//Function to find the frequency of the 
//smallest value in the array 
static ArrayList frequencyOfSmallest(int n, int arr[]) 
{ 
 
	int min=arr[0], freq=0;
	for(int i=1;i<n;i++){
		
		if(arr[i] < min){
			min=arr[i];
			freq=1;
		}
		else if(arr[i]==min){
			freq++ ;
		}
	}
	ArrayList<Integer> al=new ArrayList<>();
	al.add(min);
	al.add(freq);
	return al;
} 

 // Driver Code 
 public static void main (String[] args)  
 { 
      
     int arr[] = { 3, 2, 3, 4, 4 , 2, 2}; 
     int N = arr.length;
     System.out.println (frequencyOfSmallest(N, arr)); 
 } 
} 
