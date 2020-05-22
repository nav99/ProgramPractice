package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.omg.PortableInterceptor.INACTIVE;

public class CollectionsSortDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(35);
		al.add(25);
		al.add(20);
		al.add(50);
		al.add(44);
		Collections.sort(al, new MyComparator());
		System.out.println(al);
		
	}

}
class MyComparator implements Comparator
{
	public int compare(Object o1, Object o2){
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		return i2.compareTo(i1);
	}

	
}
