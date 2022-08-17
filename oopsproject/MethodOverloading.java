package com.oopsproject;

class Parent{
	public String displayString() {
		return "Parent is called";
	}
}
	class Child extends Parent{
		public String displayString() {
			return "Child is called";
		
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		System.out.println(c.displayString());
		Parent p = new Parent();
		System.out.println(p.displayString());
	}

}

