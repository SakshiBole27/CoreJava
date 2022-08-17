package corejavapart1;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int sum = 0;
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("sum is" + sum);
	}

}
