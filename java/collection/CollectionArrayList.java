package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionArrayList {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("Sakshi");
		li.add(0, "Siddhi");
		li.add("Priya");
		li.add(1, "Nikita");
		System.out.println("list of elements: "+li);
		System.out.println("length of list: "+li.size());	
		System.out.println("get of list: "+li.get(2));	
		System.out.println("set value to list: "+li.set(3, "Ankita"));	
		System.out.println("list of elements: "+li);
		System.out.println("remove of elements: "+li.remove(1));
		System.out.println("list of elements: "+li);	

		
		
		Iterator itr = li.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
