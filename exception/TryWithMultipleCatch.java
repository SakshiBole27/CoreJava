package com.exception;

public class TryWithMultipleCatch {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=45/2;
			System.out.println("Array element"+a[5]);
		}
		catch(ArithmeticException ae) 
		{
			System.out.println("Arithmetic Exception");
		}
		catch(ArrayIndexOutOfBoundsException ar)
		{
			System.out.println("Array Index Out Of Bounds ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("end....");
		}
	}

}
