package com.java.arraPgm;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Arr11_BirthdayCakeCandles {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
    	int maxCandleHeight = Integer.MIN_VALUE;
    	int maxFreqCount = 0;
    	for(int i=0;i<ar.length;i++){
    		if(ar[i] == maxCandleHeight){
    			maxFreqCount += 1;
    		}
    		
    		if(ar[i] > maxCandleHeight){
    			maxCandleHeight = ar[i];
    			maxFreqCount = 1;
    		}
    	}
    	
		return maxFreqCount;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

    	int arCount = scanner.nextInt();
        
        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
       //     int arItem = Integer.parseInt(arItems[i]);
            ar[i] = scanner.nextInt();
        }

        int result = birthdayCakeCandles(ar);
        System.out.println("Result "+result);
   //     bufferedWriter.write(String.valueOf(result));
    //    bufferedWriter.newLine();

  //      bufferedWriter.close();

        scanner.close();
    }
}
