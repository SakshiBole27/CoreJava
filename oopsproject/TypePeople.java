package com.oopsproject;

class Personn {

	int age;
	String name, city;

	public Personn(int a, String name, String city) {

		age = a;
		this.name = name;
		this.city = city;
	}

}

class Learners extends Personn {
	String course = "Java FullStack Development";

	public Learners() {
		super(22, "Sakshi", "Roha");
	}

	public void getDetails() {
		System.out.println("Learner Details: ");
		System.out.println("Learner's Name: " + name + ", Learner's Age: " + age + ", Learner's City: " + city
				+ ", Learner's selected course: " + course);

	}
}

public class TypePeople {
	public static void main(String[] args) {
		Learners l = new Learners();
		l.getDetails();
	}
}
