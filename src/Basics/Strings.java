package Basics;

public class Strings {
public static void main (String [] args)
{
	String bookName= "The lord of the rings";
	String keyWord = "Rings";
	String x = "The lord of the rings";
	
	if (bookName.equalsIgnoreCase("the lord of the rings"))
	{System.out.println("The");}
	
	if (bookName.equalsIgnoreCase(x))
	{
		System.out.println("The bookName is : " + x);
		
	}
	
	if (bookName.contains("rings"))
	{
		System.out.println("Contains rings");
	}
	
	System.out.println(bookName.substring(1,2));
	String firstName = "Jhon";
	String lastName = "Smith";
	String SSN = "84783778";
	String ID = firstName.substring(0, 1) + lastName.substring(0, 1) + SSN.substring(4);
	System.out.println(ID);
}
}
