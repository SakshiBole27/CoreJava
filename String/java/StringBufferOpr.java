package String.java;

public class StringBufferOpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sc = new StringBuffer("Java");
//		System.out.println("Capacity:" + sc.capacity());
//		System.out.println("Append:" + sc.append("Angular"));
//		System.out.println("Reverse:" + sc.reverse());
//		System.out.println("Replace:" + sc.replace(2, 5, "C++"));
//		System.out.println("Insert:" + sc.insert(2, "DBMS"));
//		System.out.println("Delete:" + sc.delete(2, 4));
		System.out.println("Ensure Capacity:" + sc.capacity());
		sc.ensureCapacity(20);
		System.out.println("Ensure Capacity:" + sc.capacity());
	}

}
