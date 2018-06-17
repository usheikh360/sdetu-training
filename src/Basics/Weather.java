package Basics;

public class Weather {
   public static void main (String [] args)
   //Program s designed to suggest what to wear based on weather
   {
	   int temperature = 65;
	   String sunCondition = "Sunny";
	   
	   if (temperature > 80){
		   System.out.println("Wear shorst and t-shirts");}
	   
	   else if((temperature>60) && (sunCondition == "Sunny")){
	   			System.out.println("A bit cooler");
	   			System.out.println("Wear sunglasses");
	   		}
	   else if ((temperature>60)|| (sunCondition == "Overcast"))
	   {
		   System.out.println("Looks like a cold day. Bring a sweater.");
	   }
	   else 
	   {
		   System.out.println("Looks like a cold day bring a sweater");
		  
	   }
   }
}
