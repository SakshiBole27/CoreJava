package corejavapart1;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no.");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("no. is even");
		} else {
			System.out.println("no. is odd");
		}

	}

}
