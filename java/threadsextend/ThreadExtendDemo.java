package com.java.threadsextend;

class Thread1 extends Thread{
	public void run() 
	{
		System.out.println("thread1 is running....");
	}
}

class Thread2 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		System.out.println("thread2 is running....");
	}
}

class Thread3 extends Thread{
	public void run() {
		for(int i=10;i<16;i++) {
			System.out.println(i);
		}
		System.out.println("thread3 is running....");
	}
}

public class ThreadExtendDemo {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();
		Thread2 t2 = new Thread2();
		t2.start();
		Thread3 t3 = new Thread3();
		t3.start();

	}

}
