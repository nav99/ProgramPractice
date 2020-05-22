package com.java.test;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap map = new TreeMap(new MyComprator());
		map.put(101, "yyy");
		map.put(109, "bbb");
		map.put(106, "zzz");
		map.put(104, "aaa");
		map.put(103, "ggg");
		map.put(108, "ttt");
		//map.put("sss", "sdsd");
		System.out.println(map);
		
		
	}
	
}
class MyComprator implements Comparator{
	public int compare(Object o1 , Object o2){
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}
