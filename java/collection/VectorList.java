package com.java.collection;

import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("seeta");
		v.addElement("ankita");
		v.add("pooja");
		v.add("seeta");
		v.add("meera");
		System.out.println("vector list: "+v);
		System.out.println("vector last element is : "+v.lastElement());
		System.out.println("Display element of position  3 vector: "+v.get(3));
		System.out.println("set elements: "+v.set(3, "sakshi"));
		System.out.println("vector list: "+v);
		System.out.println("capacity vector list: "+v.capacity());
		System.out.println("vector list: "+v);
		System.out.println("index of vector list: "+v.indexOf("meera"));
		System.out.println("last index of vector list: "+v.lastIndexOf("meera"));
	}

}
