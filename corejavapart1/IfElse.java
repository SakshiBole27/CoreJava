package corejavapart1;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value od a,b,c : ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if((a>b)&&(a>c)) {
			System.out.println("a is max "+a);
		}
		else if((b>a)&&(b>c)) {
			System.out.println("b is max "+b);
		}
		else {
			System.out.println("c is max "+c);
		}


	}

}
