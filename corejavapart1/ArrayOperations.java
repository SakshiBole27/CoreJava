package corejavapart1;

import java.util.Scanner;

public class ArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num[]= new int[5];
		int c1=0,c2=0,c3=0;
		System.out.println("enter array elements:");
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		System.out.println("elements of array are : ");
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}

}
