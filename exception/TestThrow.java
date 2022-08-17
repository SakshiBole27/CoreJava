package com.exception;

 class TestThrow1 {

	
		static void validate(int age) 
		{
			if(age<18)
				throw new ArithmeticException("not valid");
			else
				System.out.println("wecome to vote");
		}
}
 public class TestThrow
 {
		public static void main(String[] args) {
			TestThrow1.validate(20);
			System.out.println("rest of code....");
		}
	}
