package String.java;

import java.util.Arrays;

public class StringOperations {

	public static void main(String[] args) {
		
//		String str = "Black";
//		String str1 = "black";
//		String str2 = "  Pink   ";
//		System.out.println("Length of string is: " + str.length());
//		System.out.println("UpperCase :" + str.toUpperCase());
//		System.out.println("LowerCase :" + str.toLowerCase());
//		System.out.println("Is both strings are equal: " + str.equals(str1));
//		System.out.println("Is both strings are equal: " + str.equalsIgnoreCase(str1));
//		System.out.println("Concate string: " + str.concat(" Clouds"));
//		System.out.println("Index of: " + str.indexOf('c'));
//		System.out.println("replace string: " + str.replace("Black", "Pink"));
//		System.out.println("contains of: " + str.contains("k"));
//		System.out.println("Substring: " + str.substring(0, 3));
//		System.out.println("length :" + str2.length());
//		System.out.println("trim :" + str2.trim());
//		String str3 = str2.trim();
//		System.out.println("length :" + str3.length());
//		String str4 = "How are you?";
//		String arrStr[] = str4.split(" ", 3);
//		for (String str5 : arrStr) {
//			System.out.print(str5 + " ");
//		}
		String str = " ";
		System.out.println("is String is empty: " + str.isEmpty());
		//System.out.println("is String is blank: " + str.isBlank());
		System.out.println("java".compareToIgnoreCase("PYTHON"));
		System.out.println("java".compareTo("PYTHON"));
		System.out.println("Cooking".endsWith("king"));
		System.out.println("Cooking".startsWith("Co"));

		String str1 = "     java      ";
		String str2 = "C++";
//		System.out.println(str1.trim());
//		System.out.println(str1.strip());
		//System.out.println("leading: " + str1.stripLeading());
		//System.out.println("trailing: " + str1.stripTrailing());
		//System.out.println("repeat: " + str2.repeat(2));

		String s1 = "JAVA";
		char str3[] = new char[4];
		s1.getChars(0, 4, str3, 0);
		System.out.println("getChars method: " + Arrays.toString(str3));
//		System.out.println(s1.toCharArray());

		
	}
}
