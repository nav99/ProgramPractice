package com.test.hackerRank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArtistMissingNo {
	public static void main(String[] args) {
		int[] arr = { 7, 2, 5, 3, 5, 3 };
		int[] brr = { 7, 2, 5, 5, 6, 3, 5, 3 };
		int[] result = missingNo(arr, brr);
		for (int i = 0; i < result.length; i++)
			System.out.print(result[i] + " ");

	}

	private static int[] missingNo(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int m = brr.length;
		Map<Integer, Integer> mapA = new HashMap<Integer, Integer>();
		Map<Integer, Integer> mapB = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {

			if (mapA.containsKey(arr[i]) && mapA.get(arr[i]) > 0) {
				int value = mapA.get(arr[i]);
				mapA.put(arr[i], value + 1);

			} else {
				mapA.put(arr[i], 1);
			}
		}

		Set set = mapA.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry ma = (Entry) itr.next();
			System.out.println(ma.getKey() + "  " + ma.getValue());
		}

		System.out.println("----------");

		for (int i = 0; i < n; i++) {

			if (mapB.containsKey(arr[i]) && mapB.get(brr[i]) > 0) {
				int value = mapB.get(brr[i]);
				mapB.put(arr[i], value + 1);

			} else {
				mapA.put(brr[i], 1);
			}
		}

		Set setB = mapB.entrySet();
		Iterator itrB = set.iterator();
		while (itrB.hasNext()) {
			Map.Entry mb = (Entry) itrB.next();
			System.out.println(mb.getKey() + "  " + mb.getValue());
		}
		
		return arr;
	}

}
