package com.test.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Freq {
	public static void main(String[] args) {
		int[] arr = {5,2,3,5,1,2,2,2,5,2};
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				int value = map.get(arr[i]);
				
				map.put(arr[i],value + 1 );
				
			}else {
				map.put(arr[i], 1);
			}
			
			
		}
		
		Set s = map.entrySet();
		Iterator e = s.iterator();
		while(e.hasNext()) {
		    Map.Entry<Integer, Integer> m = (Entry<Integer, Integer>) e.next();
		    System.out.println(m.getKey() + " -> "  +m.getValue());
		}
		
	}

}
