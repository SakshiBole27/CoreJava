package com.oopsproject;
class Student2 {
	int rollNo;
	String name;
	static  String course = "Java Backend Developer";
	static int count = 0;
	public Student2(int rollNo, String name) {
		super();
		this.rollNo =rollNo;
		this.name = name;
		count++;
		System.out.println("num of objects: " +count);
	}
	public void getDetails() {
		System.out.println("Student name: "+name +", Student rollNo: "+rollNo +",Student course: "+course);
		
	}
}

public class StaticVarImplement {

	public static void main(String[] args) {
		Student2 s1 = new Student2(201,"Sakshi");
		s1.getDetails();
		Student2 s2 = new Student2(202,"Mahi");
		s2.getDetails();
		Student2 s3 = new Student2(203,"Vaishu");
		s3.getDetails();
	}

}
