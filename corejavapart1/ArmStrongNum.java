package corejavapart1;

import java.util.Scanner;

public class ArmStrongNum {

	public static void main(String[] args) {
		System.out.println("enter a num");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int originalNum, remainder, result = 0;
		originalNum = num;
		while (originalNum != 0) {
			remainder = originalNum % 10;
			//result += Math.pow(remainder, 3);
			result += remainder * remainder * remainder;
			originalNum /= 10;

		}
		if (result == num) {
			System.out.println(num + " is armstrong");
		} else {
			System.out.println(num + " is not armstrong");
		}

	}

}
