package com.oopsproject;
import java.util.Scanner;

public class DigitFctorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num:");
		int n = sc.nextInt();
		while(n!=0) {
			int d = n%10;
			n /=10;
			int f=1;
			for(int i=1;i<=d;i++) {
				f *= i;
			}
			System.out.println("factorial of" +d+"="+f);
		}
	}

}
