package com.java.arraPgm;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Arr10_MinMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	long min = arr[0];
    	long max = min;
    	long sum = min;
    	for(int i=1;i<arr.length;i++){
    		sum = sum + arr[i];
    		if(arr[i] < min){
    			min = arr[i];
    		}
    		if(arr[i] > max){
    			max = arr[i];
    		}
    		
    	}
    	System.out.println("Min Sum "+(sum - max) + " Max Sum "+(sum - min));


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
