package com.oopsproject;

// Super can be use to invoke parent class method

class Person {
	void message() {
		System.out.println("welcome");
	}
}

class Student extends Person {
	void message() {
		System.out.println("welcome to java");
	}

	void display() {
		message();
		super.message();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.display();
	}

}
