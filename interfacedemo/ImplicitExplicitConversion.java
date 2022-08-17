package com.interfacedemo;

public class ImplicitExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Implicit/Widening conversion: ");
		byte b =10;
		short s = b;
		int i = s;
		long l = i;
		float f = l;
		double d =f;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		
		
		System.out.println("Explicit/Narrowing Conversion: ");
		double d1 = 23.4;
		float f1=(float)d1;
		long l1=(long)f1;
		int i1=(int)l1;
		short s1=(short)i1;
		byte b1=(byte)s1;
		System.out.println(d1);
		System.out.println(f1);
		System.out.println(l1);
		System.out.println(i1);
		System.out.println(s1);
		System.out.println(b1);
	}

}
