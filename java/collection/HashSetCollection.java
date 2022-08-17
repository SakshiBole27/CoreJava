package com.java.collection;

import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<>(8,(float)0.50);
		hashSet.add(50);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add(40);
		hashSet.add(60);
		hashSet.add(10);
		hashSet.add(null);
		System.out.println("values inserted in set: "+hashSet);
		System.out.println(hashSet.isEmpty());
		System.out.println(hashSet.remove(20));
		System.out.println("values inserted in set: "+hashSet);
		System.out.println(hashSet.size());
		System.out.println(hashSet.contains(10));
		System.out.println(hashSet.hashCode());
		hashSet.clear();
		System.out.println("values inserted in set: "+hashSet);
		
		
	}

}
