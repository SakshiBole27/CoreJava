package corejavapart1;
import java.util.Scanner;
public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num = sc.nextInt();
		int i=2;
		boolean status = false;
		while(i<=num/2) {
			if(num%i==0) {
				status=true;
				break;
			}
			i++;
		}
		if(!status) {
			System.out.println(num + " is a prime num");
		}
		else {
			System.out.println(num + " is not a prime num");
		}
	}
}


