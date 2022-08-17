package com.oopsproject;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryToDecimal d = new BinaryToDecimal();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a user input:");
		int input=sc.nextInt();
		int result=d.convertToDecimal(input);
		if(result<0) {
			System.out.println("Invalid input");
		}
		else {
			System.out.println("result is:"+ result);
		}
	}
	private int convertToDecimal(int input) {
		int decimalNumber=0;
		int n =0;
		if(input%10 >1 || input<0 || input>11111) {
			return -1;
		}
		else {
			while(input>0) {
				int remainder = input%10;
				input/=10;
				decimalNumber += remainder + Math.pow(2, n);
				++n;
			}
		}
		return decimalNumber;
	}

}
