package com.test.concept;

import java.util.HashSet;
import java.util.*;

public class TestData {
	public static void main(String[] args) {
		Emloyee e1 = new Emloyee("abc", 1);
		Emloyee e2 = new Emloyee("abc", 1);
		System.out.println(e1.equals(e2));
		
		HashSet set = new HashSet();
		set.add(e1);
		set.add(e2);
		
		System.out.println(set.size());
		
	}

}
