
package com.oopsproject;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter elements: ");
		String text = scanner.nextLine();

		char[] arr = text.toCharArray();

		// your code goes here
		System.out.println("reverse array is: ");
		for (int i=arr.length-1; i>=0;i--) {
			
			System.out.print(arr[i] + "");
		}
		
	}

}
