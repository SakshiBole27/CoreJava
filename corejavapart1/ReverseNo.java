package corejavapart1;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5,6};
		
		int l = arr.length;
		int temp;
		int n = Math.floorDiv(l, 2);
		
		for(int i=0;i<n;i++) {
			//swap array
			temp=arr[i];
			arr[i]=arr[l-1-i];
			arr[l-1-i]=temp;
		}
		for(int elements:arr) {
			System.out.print(elements +" ");
		}
		
	}

}
