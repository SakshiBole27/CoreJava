package com.oopsproject;

class ConsDemo1{
	int x;
	ConsDemo1(){
		x=30;
		System.out.println("x = "+x);
	}
	
	ConsDemo1(int i){
		x=i;
	}
}

public class ConsDemo {

	public static void main(String[] args) {
		ConsDemo1 t = new ConsDemo1();
		ConsDemo1 t1 = new ConsDemo1(10);
		ConsDemo1 t2 = new ConsDemo1(20);
		System.out.println(t1.x+" "+t2.x);
	}

}
