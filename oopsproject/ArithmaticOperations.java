package com.oopsproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class MathOperation{
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		return a/b;
	}
	public int mod(int a,int b) {
		return a%b;
	}
	
}

public class ArithmaticOperations {

	public static void main(String[] args) throws  IOException {
		MathOperation m1 = new MathOperation();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter value of a and b :  ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter value of a and b :  ");
		int a =  Integer.parseInt(br.readLine());
		int b =  Integer.parseInt(br.readLine());
		System.out.println("Addition : " + m1.add(a, b));
		System.out.println("Subtraction: " + m1.sub(30, 20));
		System.out.println("Multiplication : " + m1.mul(12, 20));
		System.out.println("Division : " + m1.div(46, 2));
		System.out.println("Modulo : " + m1.mod(23, 10));
		

	}

}
