package com.oopsproject;

import java.util.Scanner;

class Student1 {
	int rollNo;
	String name;
	String city;

	public Student1() {
		rollNo = 101;
		name = "Sakshi";
		city = "Roha";
	}

	public Student1(String name, int rollNo, String city) {
		this.name = name;
		this.rollNo = rollNo;
		this.city = city;

	}

	public void printDetails() {
		System.out.println("\n name rollNo city of student : ");
		System.out.printf("Name : " + name + ", RollNO : " + rollNo + " ,City : " + city);
	}
}

public class StudentRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student1 s = new Student1();
		s.printDetails();
		System.out.println("\n enter name, rollNo , city of student");
		String name = sc.nextLine();
		int rollNo = sc.nextInt();
		String city = sc.nextLine();
		Student1 s1 = new Student1(name, rollNo, city);
		s1.printDetails();

	}

}
