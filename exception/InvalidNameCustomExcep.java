package com.exception;

import java.util.Scanner;
 
class InvalidNameExcep extends Exception
{
	public InvalidNameExcep(String s)
	{
		super(s);
	}
}

public class InvalidNameCustomExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvalidNameCustomExcep obj =new InvalidNameCustomExcep();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter firstName ");
		String firstName = sc.nextLine();
		System.out.println("enter lastName ");
		String lastName = sc.nextLine();
		
		try
		{
			obj.printfullName(firstName,lastName);
		}
		catch(InvalidNameExcep e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void printfullName(String firstName,String lastName)throws InvalidNameExcep
	{
		if(firstName.isEmpty() || lastName.isEmpty()) {
			throw new InvalidNameExcep("Invalid Name Excep");
		}
		else {
			System.out.println("firstname " +firstName +", lastname "+lastName);
		}
	}

}
