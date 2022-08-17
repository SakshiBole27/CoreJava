package com.java.threadsextend;

class Factorial3 extends Thread{
	int factorialNumber =0;
	public Factorial3(int fact) {
		this.factorialNumber = fact;
	}
	@Override
	public void run() {
		int j = findFacto(factorialNumber);
		System.out.println("Factorial is : "+j);
	}
	synchronized public int findFacto(int number) {
		int i,fact=1;
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
		return fact;
	}
}

class Table extends Thread{
	int num=0;
	public Table (int num) {
		this.num=num;
	}
	@Override
	public void run() {
		createTable(num);
	}
	synchronized public void createTable(int number) {
		System.out.println("\nTable is: ");
		for(int i =1;i<=10;i++) {
		
		System.out.println(number +"*"+ i + "=" +(number * i));
	}
}
}


public class SyncThreadDemo {

	public static void main(String[] args) {
		Factorial3 f = new Factorial3(3);
		f.start();
		
		Table t = new Table(5);
		t.start();
	}

}
