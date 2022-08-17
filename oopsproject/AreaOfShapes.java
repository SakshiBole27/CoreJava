package com.oopsproject;

class Shapes{
	void getArea() {
		
	}
}
class Circle extends Shapes{
	void getArea() {
		double r = 4;
		double area1= 3.14*r*r;
		System.out.println("Circle Area: " +area1);
	}
}
class Triangle extends Shapes{
	void getArea() {
		int b=4;
	    int h=3;
	    double area2= 0.5*(b*h);
		System.out.println("Triangle Area: " +area2);
	}
	
}
class Rectangle extends Shapes{
	void getArea() {
		int l = 2;
		int b = 3;
		int area3 = l*b;
		System.out.println("Rectangle Area: " +area3);
	}
	
}

public class AreaOfShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle a1 = new Circle();
a1.getArea();
Triangle a2 = new Triangle();
a2.getArea();
Rectangle a3 = new Rectangle();
a3.getArea();

	}

}
