package com.test.concept;

import java.util.HashMap;
import java.util.Map;

public class MapDebug {

	private  String s1 ;
	private  String s2 ;
	
	public String getS1() {
		return s1;
	}
	public void setS1(String s1) {
		this.s1 = s1;
	}
	public String getS2() {
		return s2;
	}
	public void setS2(String s2) {
		this.s2 = s2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapDebug mapDebug = new MapDebug();
		mapDebug.setS1("ABb");
		mapDebug.setS2("Addd");
		String a1 = mapDebug.getS1();
		String a2 = mapDebug.getS2();
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		Map<String,Integer> m = new HashMap<>();
		m.put(mapDebug.getS1(), 11);
		m.put(mapDebug.getS2(), 12);
		
		
		
	}
	@Override
	public int hashCode() {
		
		return 1;
	}
	@Override
	public boolean equals(Object obj) {	
		return true;
	}


}
