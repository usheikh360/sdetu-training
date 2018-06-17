package Basics;

public class FibonnaciApp {

	public static void main (String [] args)
	{
		//fib add the previous two fib numbers together
		//fib(0) = 0;
		//fib (1) = 1;
		//fib (2) = fib(1) + fib(0) = 1;
		//fib(3) = fib(2) + fib(1) = 2;
		//fib(4) = fib(3) + fib(2) = 3;
		//fib(5) = fib(4) + fib(3) = 5;
		//fib(6) = fib(5) + fib(4) = 8;
		
		System.out.println(fib(6));
	}
		public static int fib(int n)
		{
			if (n==0)
			
			{	return 0;}
			
			else if (n==1)
				{return 1;}
			
			else return (fib(n-1) + fib(n-2));
		}
		
}


