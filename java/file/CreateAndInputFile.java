package com.java.file;

import java.io.FileWriter;
public class CreateAndInputFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileWriter fw = new FileWriter("d://abc.txt");
			fw.write("welcome");
					fw.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
			System.out.println("Success");
		}
	}


