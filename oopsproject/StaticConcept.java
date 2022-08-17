package com.oopsproject;

public class StaticConcept {
	public static int minfunction(int n1,int n2) {
		int min=0;
		if(n1>n2) {
			min=n2;
		}
		else {
			min=n1;
		}
		return min;
	}
	public static double minfunction(double n3,double n4) {
		double min =0.0;
		if(n3>n4) {
			min=n4;
		}
		else {
			min=n3;
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=4, n2=3;
		double n3=2.1 ,n4= 6.9;
		int result1= minfunction(n1,n2);
		double result2= minfunction(n3,n4);
		System.out.println("Result1 is: "+result1);
		System.out.println("Result2 is: "+result2);
	}

}
