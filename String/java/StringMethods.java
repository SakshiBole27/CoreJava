package String.java;

public class StringMethods {

	public static void main(String[] args) {
		//Length of string 
		String a = "sakshi";
		 int value = a.length();
		 System.out.println(value);
		 
		 //toUpperCase of String
		 String b ="Swarup";
		 String upcase = b.toUpperCase();
		 System.out.println(upcase);
		 
		 //toLowerCase of String
		 String c ="SwaTi";
		 String lowcase = c.toLowerCase();
		 System.out.println(lowcase);
		 
		 //trim of String
		 String d ="     Jagdish   Bole ";
		 String nonTrim = d.trim();
		 System.out.println(nonTrim);
		 
		 //SubString
		 String e ="Anita";
		 System.out.println(e.substring(2));
		 //SubString(start,end)
		 System.out.println(e.substring(2,4));
		 
		 //replace String(char,char)
		 String f ="Harry";
		 System.out.println(f.replace('r','p'));
		 //replace(target,replacement)
		 System.out.println(f.replace("rry", "ier"));
		 //Starts with return boolean value
		 System.out.println(f.startsWith("Har"));
		 System.out.println(f.startsWith("par"));
		 // End with
		 System.out.println(f.endsWith("ary"));
		 
		 //charAt 
		 System.out.println(f.charAt(1));
		 
		 //indexOf(str)
		 String g="Harryrry";
		 System.out.println(g.indexOf('r'));
		 //indexOf(str,from index)
		 System.out.println(g.indexOf("rry", 4));
		 //returns -1 if 
		 System.out.println(g.indexOf("rry34556", 4));
		 
		 //lastindexOf
		 System.out.println(g.lastIndexOf('r'));
		 System.out.println(g.lastIndexOf("rry", 2));
		 
		 //equals
		 System.out.println(f.equals("Harry"));
		 //equalsIgnoreCase
		 System.out.println(f.equalsIgnoreCase("harry"));
		 
		 
		 //escape sequence
		 System.out.println("this is escape sequence\" Sakshi");
		 System.out.println("this is escape sequence\\ Sakshi");
	}
	

}
