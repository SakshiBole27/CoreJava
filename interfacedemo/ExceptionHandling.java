package com.interfacedemo;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int data = 50/0;
}
catch(Exception e) {
	System.out.println(e);
}
finally {
System.out.println("rest of code....");}
	}

}
