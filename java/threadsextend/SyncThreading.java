package com.java.threadsextend;

class First{
	 synchronized void dispplay(String msg) {
		System.out.println("["+msg);
//		try {
//			Thread.sleep(100);;
//		}
//		catch(InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println("]");
	}
}

class Second extends Thread{
	First f;
	String msg;
	public Second(First f, String msg) {
		this.f = f;
		this.msg = msg;
	}
	@Override
	public void run() {
		f.dispplay(msg);
	}
}

public class SyncThreading {

	public static void main(String[] args) {
		First f = new First();
		Second t1 = new Second(f, "Hello");
		t1.start();
		Second t2 = new Second(f, "Welcome");
		t2.start();
	}

}
