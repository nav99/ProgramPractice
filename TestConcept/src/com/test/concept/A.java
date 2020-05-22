package com.test.concept;

import java.util.HashMap;
import java.util.IdentityHashMap;

class Student{
	
}
class Customer{
	
}

public class A {
	public static void main(String[] args) {
		Object[] s1= new Object[10];
		s1[0] = new Student();
		s1[1] = new Customer();
		IdentityHashMap map = new IdentityHashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		map.put(i1, "abc");
		map.put(i2, "xyz");
		System.out.println(map);
	}

}
