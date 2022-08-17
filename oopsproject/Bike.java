package com.oopsproject;
//example of Super keyword
class Vehicle{
	int speed=50;
	Vehicle(String name){
		System.out.println("Vehicle class" +name);
	}
}
class Bike extends Vehicle{
	int speed=100;
	Bike(){
		super("Audii");
		System.out.println("Bike class" );
	}

void display() {
	System.out.println(super.speed);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bike b =new Bike();
b.display();
	}
}
	
