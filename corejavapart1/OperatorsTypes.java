package corejavapart1;

public class OperatorsTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4,b=5,c=7;
		System.out.println("relational operators");
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println("Logical operators");
		System.out.println((b>a)&&(c>b));
		System.out.println((a<b)&&(b<c));
		System.out.println((a>b)||(b<c));
		System.out.println(!(a==b));
		System.out.println("Assignment Operators");
		System.out.println(a += b);
		System.out.println(a=b);
		System.out.println("Arithmetic Operators");
		System.out.println(a+b);
		System.out.println(c-b);
		System.out.println(a*b);
		System.out.println(b/a);
		System.out.println(b%a);
		System.out.println(b++);
		System.out.println(c--);
		System.out.println("Bitwise Operators");
		System.out.println(a&b);
		System.out.println(c|b);
	}

}
