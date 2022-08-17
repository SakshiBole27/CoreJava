package corejavapart1;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row, col,i,j;
		int arr[][]=new int[10][10];
		Scanner sc = new Scanner(System.in);
		System.out.print("enter row for array");
		row = sc.nextInt();
		System.out.print("enter column for array");
		col = sc.nextInt();
		System.out.println("enter"+(row+col)+"array elements");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.print("array is\n");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
