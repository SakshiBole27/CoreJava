package com.oopsproject;
class Person1{
int age;
String name;
Person1(){
	System.out.println("non parameterizes cons called:");
}
Person1(String name, int age){
	this.name=name;
	this.age=age;
	System.out.println("parameterizes cons called:");
	System.out.println("name:"+name+"age:"+age);
}
Person1(Person1 p2){
this.name=p2.name;
this.age=p2.age;
System.out.println("copy cons called:");
System.out.println("name:"+name+"age:"+age);
}
}
public class Studying{
	public static void main(String[] args) {
		//Non parameterized constructor
		Person1 p = new Person1();
		// parameterized constructor
		Person1 p1 = new Person1("abc",22);
		//copy constructor
		Person1 p2 = new Person1(p1);
	}

}
