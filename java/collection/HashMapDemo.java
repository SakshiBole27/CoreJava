package com.java.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("Pink", 3);
		hm.put("Yellow", 4);
		hm.put("Red", 5);
		hm.put("Green", 6);
		hm.put("White", 7);
		hm.put("Black", 8);
		hm.put("Redish", 8);
		hm.put("Black", 10);
		System.out.println("element of hashmap : "+hm);
		System.out.println("size : "+hm.size());
		System.out.println("Get element of hashmap : "+hm.get("Pink"));
		System.out.println("PutIfAbsent : "+hm.putIfAbsent("Blue", 3));
		System.out.println("keySet : "+hm.keySet());
		System.out.println("values : "+hm.values());
		hm.replace("Pink",13);
		System.out.println("element of hashmap : "+hm);
		System.out.println("ContainsKey : "+hm.containsKey("Pink"));
		System.out.println("Remove element of hashmap : "+hm.remove("Pink"));
		System.out.println("element of hashmap : "+hm);
		for(Map.Entry<String, Integer> entry:hm.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		System.out.println("entrySet : "+hm.entrySet());
	}

}
