package com.oopsproject;

class Car{
	String s;
	Car(){
		s="Ford";
		System.out.println(s);
	}
	void getBrand() {
		System.out.println("Brand = "+s);
	}
}

public class CarBrand {

	public static void main(String[] args) {
		Car c = new Car();
		c.getBrand();

	}

}
