package corejavapart1;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {2,4,5,6,8};
		System.out.println("first element of array:"+num[0]);
		System.out.println("last element of array:"+num[4]);
		System.out.println("length of array"+num.length);
		
		// Enter elements of Array
		
		//2D Arrays
		int [][]flats= new int[2][3];
		flats[0][0]=101;
		flats[0][1]=102;
		flats[0][2]=103;
		flats[1][0]=201;
		flats[1][1]=202;
		flats[1][2]=203;
		System.out.println("print 2D array using for loop ");
		for(int i =0;i<flats.length;i++) {
			for(int j=0;j<flats[i].length;j++) {
				System.out.print(flats[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
	
		
		
	}

}
