package Basics;

public class Assignment1 {
//factorial 
	// 1! = 1;
	// 2! = 2*1 = 2 ;
	// 3! = 3*2*1 = 6;
	// 4! = 4*3*2*1 = 24;
	public static void main (String [] args)
	{
		System.out.println(fac(4));
	}
	public static int fac(int n)
	{
		int x;
		if (n==1 || n==2)
		{
		
		if (n==1)
		{
			return 1;
		}
		else if (n==2);{
		return 2;
		}
		}
		else 
		{
			int i = n;
			while (i!=1);
			{
				x = n - i;
				i--;
			}
			System.out.println(x);
			return x;
			
		}
		

		/*return (fac)
		 while (i!=1)
		 {
			 
			 
			 
		 }*/
			
			
			//n = (n-i);
		//}
		
		//n = n * (n-1) * (n-2) * (n-3) 
		// 4 = 4 * 3 * 2 * 1 __ has four numbers so 4 fac
		//(n/n+1) - n/(n+2) - n/(n+3)
		
		
	}
}
