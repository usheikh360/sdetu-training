package Basics;

public class Lab1p3 {

	public static void main (String [] args)
	{
	   int a[] = {1,2,3,4};	
	
		System.out.println(min(a));
		System.out.println(max(a));
	    System.out.println(ave(a));
	   
	   
	}
	
	public static int min (int [] a)
	{
		int z = 0;
		for (int i=0; i<a.length; i++)
		{
			if (a[i]<z)
				z = a[i];
		}
		return z;
	}
	
	public static int max (int [] b)
	{
		int z = 0;
        for (int i = 0; i<b.length; i++)
         {
	     if (b[i]>z)
	    	 z= b[i];
         }
		return z;

	}
	
	public static int ave (int [] c)
	{
		int total =0;
		for (int i=0; i<c.length-1; i++)
		{
			//total = c[i] +c[i+1];
			total = total + c[i];
		}
		
		return total/c.length;

	}
}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   