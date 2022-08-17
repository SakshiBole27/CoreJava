package com.oopsproject;
class Employee{
	int salary=20000;
}
class Permanant extends Employee{
	void displayIncrement() {
		System.out.println("Before increment salary of permanant employee"+salary);
		salary=salary+(salary*15)/100;
		System.out.println("after increment"+salary);
		
	}
}
class Temporary extends Employee{
	void displayIncrement() {
		System.out.println("Before increment salary of temporary employee"+salary);
		salary=salary+(salary*10)/100;
		System.out.println("after increment"+salary);
	}
}

public class HierEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temporary temp = new Temporary();
		Permanant pe = new Permanant();
		temp.displayIncrement();
		pe.displayIncrement();
	}

}
