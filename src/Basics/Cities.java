package Basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define Arrays
       String[] cities  = {"London", "Paris", "New York"};
       System.out.println(cities[0]);
       System.out.println(cities[1]);
       System.out.println(cities[2]);
       
       //Declare & define the array (only size);
       String[] states = new String [5];
       states[0] = "California";
       states[1]= "a";
       states[2] = "b";
       states[3] = "c";
       states[4] = "d";
       System.out.println(states[0]);
	  
	
	  //Declare array
	  String[] countries;
	  
	  //Define the array
	  countries = new String [3];
	  countries [0] = "Pakistan";
	  countries [1] = "England";
	  countries [2] = "China";
      
	  //Do loop
	  int i = 0;
	  do 
	  {
		  System.out.println(countries[i]);
		  i++;
	  }
	  while (i<3);
	  
	  
	/*  
	  //While loop
	  int x = 0;
	  while (x<2)
		  {
			  System.out.println(x);
			  i++;
		  } */
	  //While, with boolean
	  int n = 0;
	  Boolean country = false;
	  while (!country)
	  {
		  String countryx = countries[n];
		  System.out.println(countryx);
		  if (countryx == "England")
		  {
			  System.out.println("Country found");
			  country = true;
		  }
		  n++;
		  
	  } 
		  
	  
	  /*WRONG*int n = 0;
	  Boolean country = false;
	  while (!country)
	  {
		  String countryx = countries[n];
		  //System.out.println(countryx);
		  System.out.println(countries[i]);
		 // n=n++;
		  if (countries[n] =="China")
		  {
			  country = true;
		  }
	  } */
	  
	  //For loop
	  for (int x = 0; x< 3; x++)
	  {
		  System.out.println(countries[x]);
	  }
	  }
	}


	

