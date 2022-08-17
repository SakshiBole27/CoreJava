package corejavapart1;
import java.util.Scanner;

public class DecimalInputAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		   System.out.println("Enter Two Numbers (Press Enter after each):");
		   //two variables to hold numbers
		   double n1, n2, n3;
		   n1 = sc.nextDouble();
		   n2 = sc.nextDouble();
		   n3 = n1 + n2;
		   System.out.println("Total = " + n3);
		  
		

	}

}
