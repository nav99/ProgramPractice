package com.java.test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SuperReduceString {
	// Complete the superReducedString function below.
    static String superReducedString(String s) {
    	Stack<Character> stack = new Stack<>();
    	for(Character ch : s.toCharArray()){
    		if(!stack.isEmpty() && stack.peek() == ch){
    			stack.pop();
    		}else
    			stack.push(ch);
    	}
    	if(stack.isEmpty()){
    		return "Empty String";
    	}else{
    		StringBuilder sb = new StringBuilder();
    		while(!stack.isEmpty()){
    			sb.append(stack.peek());
    			stack.pop();
    		}
    		sb.reverse();
    		String result = String.valueOf(sb);
    		return result;
    	}

    }

    public static void main(String[] args) throws IOException {
     
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
    	System.out.println("String --> "+ s);
        String result = superReducedString(s);
        System.out.println("Result "+ result);
    }
}
