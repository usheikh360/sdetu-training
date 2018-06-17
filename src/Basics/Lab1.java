package Basics;

public class Lab1 {
public static void main(String [] args)
{
	//System.out.println(sum(5));
	//Write a function that takes a value N and returns the sum of 1 to n
	int[] a = {1,2,3};
    System.out.println(sum(a));
}

public static int sum (int [] a)
{
	int sum=0;
	for (int i=0; i<a.length; i++)
	{
		sum = sum + a[i];
	}
	return sum;
	
}

/*public static int sum(int n)
{

	for (int i =n-1;i!=0; i--)//3//2//1
	{
		
		n = n +i;//7//9//10
	}
	return n;//10
}*/
}











	
	
	
	
	
	
	
	/*int s = 0;
	for (int i = n; i!=1; i--)
	{
		s = n + i;
		//2 6
		//
	}*/
	/*int i =n;
	int x = 0;
	 while (i!=1)
		 {
		 x = (n + (i-1));
		 i--;
		 }
	 return x;*/
	

