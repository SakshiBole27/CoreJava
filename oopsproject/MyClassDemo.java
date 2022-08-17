package com.oopsproject;

class ConsDemos {
	int x;

	public ConsDemos() {
		x = 10;
		System.out.println("Value of x is: " + x);
	}

	public ConsDemos(int x) {
		this.x = x;
		System.out.println("Value of x is: " + x);

	}

}

public class MyClassDemo {

	public static void main(String[] args) {
		ConsDemos c = new ConsDemos();
		ConsDemos c1 = new ConsDemos(123);
		ConsDemos c2 = new ConsDemos(34);

	}

}
