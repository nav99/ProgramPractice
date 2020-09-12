package com.test.chair;
import java.io.*;
import java.util.*;

public class Hartals {
	
	public static int check(int days, int parties, int[] hartals){
		
		int daysLost = 0;
		for (int i=1;i<=days;i++){
			if (i%7==6 || i%7==0) continue;
			for (int j=0;j<parties;j++){
				if (i%hartals[j]==0) {
					daysLost++;
					break;
				}
			}
		}
		
		return daysLost;
	}
	
	
	public static void main(String[] args) throws IOException{
		
		/*BufferedReader br = new BufferedReader(new FileReader("new.txt"));*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter TestCase");
		int testCases = Integer.parseInt(br.readLine());
		
		for (int i=0;i<testCases;i++){
			System.out.println("Enter days");
			int days = Integer.parseInt(br.readLine());
			System.out.println("Enter Parties");
			int parties = Integer.parseInt(br.readLine());
			System.out.println("Enter Hartals");
			int[] hartals = new int[parties];
			for (int j=0;j<parties;j++){
				hartals[j] = Integer.parseInt(br.readLine());
			}
			System.out.println(check(days,parties,hartals));
		}
		
	}
	
}