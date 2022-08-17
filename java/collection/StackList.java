package com.java.collection;

import java.util.Stack;

public class StackList {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		System.out.println("Check stack empty or not: "+st.empty());
		st.push(5);
		st.push(3);
		st.push(2);
		st.push(9);
		st.add(2);
		st.push(9);
		System.out.println("elements of stack: "+st);
		System.out.println("check stack empty or not:  "+st.isEmpty());
		st.pop();
		System.out.println("elements of stack: "+st);
		
		System.out.println("elements of stack: "+st.peek());
		System.out.println("elements of stack: "+st);
		System.out.println("Searching elements: "+st.search(10));
		
		
	}

}
