package com.java.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileExist {
	public static void main(String[] args) {
		File myobj = new File("d:\\abc.txt");
		if (myobj.exists()) {
			System.out.println("File name : "+myobj.getName());
			System.out.println("Absolute path : "+myobj.getAbsolutePath());
			System.out.println(" Writeable: "+myobj.canWrite());
			System.out.println(" Readable: "+myobj.canRead());
			System.out.println(" file size in bytes: "+myobj.length());
		}
		else
		{
			System.out.println("File does not exists");
		}
	}

}
