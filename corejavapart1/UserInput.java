package corejavapart1;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter roll no: ");
		int rollNo = sc.nextInt();
		System.out.println("rollNo is : "+rollNo);
		
		System.out.println("enter name : ");
		String name = sc.next();
		System.out.println("name is : "+name);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insert a num: ");
		int num = input.nextInt();
		
		input.nextLine();
		
		System.out.println("text1 : ");
		String text1 = input.nextLine();
		System.out.println("text2 : ");
		String text2 = input.nextLine();
		
		System.out.println("num is : "+num);
		System.out.println("text1 : "+text1);
		System.out.println("text2 : "+text2);
		
	}

}
