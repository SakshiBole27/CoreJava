package com.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputBufferReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name");
		
		String name = br.readLine();
		
		System.out.println("Enter rollno");
		
		int rollno = Integer.parseInt(br.readLine());
		
		System.out.println("Name is "+name);
		
		System.out.println("Roll no is "+rollno);
	}

}
