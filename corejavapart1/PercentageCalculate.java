package corejavapart1;
import java.util.Scanner;

public class PercentageCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter physics marks:");
		float s1= sc.nextFloat();
		System.out.println("enter chemistry marks:");
		float s2= sc.nextFloat();
		System.out.println("enter maths marks:");
		float s3= sc.nextFloat();
		System.out.println("enter english marks:");
		float s4= sc.nextFloat();
		System.out.println("enter biology marks:");
		float s5= sc.nextFloat();
		 float total = (s1+s2+s3+s4+s5)/500;
		 
		float result = total*100;
		System.out.println("result is" +result);
	}

}
