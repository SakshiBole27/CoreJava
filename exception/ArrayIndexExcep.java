package com.exception;

public class ArrayIndexExcep {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[7]=45;
			System.out.println("Array element"+a[2]);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
