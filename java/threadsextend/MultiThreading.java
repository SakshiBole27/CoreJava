package com.java.threadsextend;

class Multiplication implements Runnable{
	@Override
	public void run() {
		int num =5 ;
		for(int i=1;i<=10;i++) {
			System.out.println("table of 5*"+i+"="+num*i);
		}
		System.out.println("Multiplication is running...");
	}
}

class EvenOdd implements Runnable{
	@Override
	public void run() {
		int num1 = 12;
		if(num1 % 2==0) {
			System.out.println("num is even: "+num1);
		}
		else {
			System.out.println("num is odd");
		}
		System.out.println("EvenOdd is running....");
	}
}

class Factorial implements Runnable{
	@Override
	public void run() {
		int num2=5;
		int i=1;
		int fact=1;
		while(i<=num2) {
			fact*=i;
			i++;
		}
		System.out.println("factorial num is: "+fact);
		System.out.println("factorial is running....");
	}
	}

class Fibonacci implements Runnable{
	@Override
	public void run() {
		int f1 =0,f2=1;
		System.out.println("fibonacci series is:"+f1+""+f2);
		for(int i=1;i<=7;i++) {
			int f3=f1+f2;
			System.out.println(" "+f3);
			f1=f2;
			f2=f3;
		}
		System.out.println("fibonacci series is running....");
	}
	
	}
public class MultiThreading {

	public static void main(String[] args) {
		
		Multiplication m = new Multiplication();
		Thread t1 = new Thread(m);
		t1.start();
		
		EvenOdd e = new EvenOdd();
        Thread t2 = new Thread(e);
        t2.start();
        
		Factorial f = new Factorial();
		Thread t3 = new Thread(f);
		t3.start();
		
		Fibonacci fi = new Fibonacci();
		Thread t4 = new Thread(fi);
		t4.start();

	}

}
