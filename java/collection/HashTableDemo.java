package com.java.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(1, "Dog");
		ht.put(2, "Cat");
		ht.put(3, "Deer");
		ht.put(4, "Tiger");
		ht.put(5, "Lion");
		
		System.out.println("element of hashmap : "+ht);
		System.out.println("size : "+ht.size());
		System.out.println("Get element of hashmap : "+ht.get(5));
		System.out.println("PutIfAbsent : "+ht.putIfAbsent(6,"Bear"));
		System.out.println("keySet : "+ht.keySet());
		System.out.println("values : "+ht.values());
		ht.replace(2,"Yaak");
		System.out.println("element of hashmap : "+ht);
		System.out.println("ContainsKey : "+ht.containsKey(5));
		System.out.println("Remove element ofthashmap : "+ht.remove(2));
		System.out.println("element of hashmap : "+ht);
		for(Map.Entry<Integer, String> entry:ht.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		System.out.println("entrySet : "+ht.entrySet());
	}

}
