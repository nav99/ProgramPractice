package com.test.concept;

import java.util.Date;


import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DateDemogm {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
       String[] str = s.split(":");
       int hour = Integer.parseInt(str[0]);
       String min = str[1];
       String secPeriod = str[2];
       String sec = str[2].substring(0,secPeriod.length() - 2);
       String period = str[2].substring(secPeriod.length() - 2, secPeriod.length());
       
       String newTImeInString = "";
       if((0 <= hour && hour < 12) && (period.equalsIgnoreCase("AM"))){
    	   newTImeInString = String.format("%02d", hour) + ":" + min + ":" + sec;
       }else if((0 <= hour && hour < 12) && (period.equalsIgnoreCase("PM"))){
    	   newTImeInString = (12 + hour) + ":" + min + ":" + sec;
       }else if((hour == 12) && (period.equalsIgnoreCase("AM"))){
    	   newTImeInString = "00" + ":" + min + ":" + sec;
       }else if((hour == 12) && period.equalsIgnoreCase("PM")){
    	   newTImeInString = hour + ":" + min + ":" + sec;
       }
       
       return newTImeInString;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
   
    	System.out.println("Enter date ");
        String s = scan.nextLine();

        String result = timeConversion(s);
        System.out.println(result);

        
      }
}

