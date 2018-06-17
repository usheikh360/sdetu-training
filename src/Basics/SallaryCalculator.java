package Basics;

public class SallaryCalculator {
public static void main(String [] args)
{
	//Let's create a variable to define our career
	
	//Declare a variable
	String career;
	System.out.println("Program is starting");
	
	//Declared a variable
	career = "Software Developer";
	System.out.println("My career is: " + career);
	
	//Declare & Define 
	int hoursPerWeek = 40;
	int weeksPerYear = 50;
	double rate = 42.50;
	career = "Web developer";
	
	double sallary = hoursPerWeek * weeksPerYear * rate;
	System.out.println("Annual sallary: " + sallary);
	//Compute our annual Salary 
	// rate * hoursPerWeek *weekPerYear
}
}
