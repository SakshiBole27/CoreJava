package corejavapart1;
import java.util.Scanner;
public class PrintGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter physics marks:");
		int physics = sc.nextInt();
		System.out.println("enter chemistry marks:");
		int chemistry = sc.nextInt();
		System.out.println("enter maths marks:");
		int maths = sc.nextInt();
		
		double total = ((physics+chemistry+maths)/3);
		
		
		System.out.println("result marks are" +" " +total);
		
		if(total>80 && total<100) {
			System.out.println("Grade A");
		}
		else if(total>70 && total<80) {
			System.out.println("Grade B");
		}
		else if(total>60 && total<70) {
			System.out.println("Grade C");
		}
		else if(total>35 && total<60) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Fail");
		}
		
	}

}
