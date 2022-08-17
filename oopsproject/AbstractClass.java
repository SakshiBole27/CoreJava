package com.oopsproject;
abstract class MyClass
{
	abstract void calculate(double x);
}
class Square extends MyClassDemo
{
	void calculate(double x)
	{
		System.out.println("Square"+(x*x));
	}
}
class SquareRoot extends MyClassDemo
{
	void calculate(double x)
	{
		System.out.println("SquareRoot"+Math.sqrt(x));
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square obj1= new Square();
		obj1.calculate(4);
		SquareRoot obj2= new SquareRoot();
		obj2.calculate(64);
		MyClassDemo reference;
		reference =obj1;
		obj1.calculate(5);
	}

}
