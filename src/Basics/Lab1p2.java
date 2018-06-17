package Basics;

public class Lab1p2 {
public static void main (String [] args)
{
	System.out.println(factorial(3));
	
}

public static int factorial(int n)
{
	if (n==0)
	{
		return 1;
	}
	else if (n==1)
	{
		return 1;
	}
	else
	{
	return factorial(n-1) *n;
}
}
}
