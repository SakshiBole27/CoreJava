package corejavapart1;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		
		
		int i , j ,k, count =1;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a num : ");
		int n = sc.nextInt();
		
		//Star Pattern 1
		
//		for( i=0;i<n;i++) {
//			for( j=0;j<=i;j++) {
//			System.out.print("* ");
//			}
//			System.out.println("\n");
//		}
//		
	
		//Star Pattern 2
		
//		for(i=0;i<n;i++) {
//			for(j=1;j<n-i;j++) {
//				System.out.print(" ");
//			}
//			for(k=0;k<=i;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		
		//num Pattern 3
		
		for(i=0;i<n;i++) {
			for(j=0;j<=i;j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}
	
}
