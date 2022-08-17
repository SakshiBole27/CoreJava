package corejavapart1;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		int a[]= {1,4,2,6,8};
		String arr[]= {"black","blue","pink","green"};
		Arrays.sort(arr);
		//int b[] = Arrays.copyOfRange(a, 0, 3);
		int c= Arrays.binarySearch(arr, "pink");
		
		System.out.println("sorted array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
//		System.out.println("\n elements in b arary: ");
//		for(int i=0;i<b.length;i++) {
//			b[i]++;
//			System.out.println(b[i]+" ");
//		}
		System.out.println("\n elements is found at index : " +c);
		
	}

}
