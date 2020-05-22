package com.test.concept;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class MapDataPrint {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(801,"aaa");	
		map.put(106,"uuuu");	
		map.put(107,"rrr");	
		map.put(54,"ggww");	
		map.put(9999,"ggg");	
		map.put(5,"bbb");	
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			Map.Entry m=(Entry) itr.next();
			System.out.println(m.getKey()+"  "+ m.getValue());
		}
		
	}

}
