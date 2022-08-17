package corejavapart1;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		char operator;
		double num1,num2,result;
		Scanner input = new Scanner(System.in);
		System.out.println("****Calculator****");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
	    System.out.println("3. Multiplication");
	    System.out.println("4. Division");
		
		operator= input.next().charAt(0);
		System.out.println("enter num 1 : ");
		num1=input.nextDouble();
		System.out.println("enter num 2 : ");
		num2=input.nextDouble();
		
		switch(operator) {
		case'+':
			result = num1+num2;
			System.out.println("Addition is : "+result);
			break;
			
		case'-':
			result = num1-num2;
			System.out.println("Substraction is : "+result);
			break;
			
		case'*':
			result = num1*num2;
			System.out.println("Multiplication is : "+result);
	
			break;
		case'/':
			result = num1/num2;
			System.out.println("Division is : "+result);
			break;
			default:
				System.out.println("inavalid  ");
		}
	}

}
