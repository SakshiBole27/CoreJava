package com.oopsproject;
import java.util.Scanner;
public class DigitFctorial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n , i, fact, k=0,rem;
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		if(n<0) {
			System.out.println("num too small");
			System.exit(0);
		}
		if(n>32767) {
			System.out.println("num too big");
			System.exit(0);
		}
		int factorial[]= new int[100];
		while(n!=0) {
			rem=n%10;
			fact=1;
			for(i=1;i<=rem;i++) {
				fact = fact*i;
			}
			factorial[k]=fact;
			k++;
			n=n/10;
		}
		for(i=k-1;i>=0;i--) {
			System.out.println(factorial[i]);
			
		}
	}

}
