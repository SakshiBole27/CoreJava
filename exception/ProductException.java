package com.exception;
class InvalidProductException extends Exception
{
	public InvalidProductException(String s) 
	{
		super(s);
	}
}
public class ProductException
{
	void productCheck(int weight)throws InvalidProductException
	{
		if(weight<100)
		{
			throw new InvalidProductException("product Invalid");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ProductException obj = new  ProductException();
		 try 
		 {
			obj.productCheck(60); 
		 }
		 catch(InvalidProductException ex)
		 {
			 System.out.println("Caught the exception");
			 System.out.println(ex.getMessage());
		 }
	}

}
