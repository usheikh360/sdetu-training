package Basics;

public class Numbercalc {
public static void main( String [] args)
{
	System.out.println("Start here");
	printThis();
	addNumbers(3,2);
	int a=8;
	int b=2;
	System.out.println("Multiplication of number varibales a: " + a + "and b: " + b + "= " + multiply(a,b) );
	
}

  public static void printThis()
  {
	  System.out.println("About functions");
  }
  public static void addNumbers(int x, int y)
  {
	  System.out.println("The numbers: " +  x + " and "+ y);
	  int sum = x + y;
	  System.out.println("is " + sum);
  }
  
  public static int multiply(int x, int z)
  {
	  
	  int m = x*z;
	  return m;
  }
  
  
}
