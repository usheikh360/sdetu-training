package OOP;

class StudentDatabase
{
	String name;
	String SNN; 
	String emailID;
	private static int ID;
	double balance = 9000;
	private String phone;
	private String city;
	private String state;
	
	public StudentDatabase(String name, String SNN)
	{
		this.name = name;
		this.SNN = SNN;
		emailID = name + randomNumber() + "@qmul.ac.uk";
	}
	
	public int randomNumber()
	{
		return (int)Math.random() *10;
	}
	
	public String generateUserID()
	{
		String userID;
		userID = ID + (randomNumber()*1000) + SNN.substring(SNN.length()-4);
		return userID;
	}
	
	public void enrollStudent ()
	{
		printMessage ("Student enrolled");
		printMessage("Student Name: " + name);
		printMessage("Student's email ID:" + emailID);
		printMessage("Student's user ID:" + generateUserID());
		
	}
	
	public void printMessage(String message)
	{
		System.out.println(message);
	}
	
	public void pay(double amount)
	{
		balance = balance - amount;
	}
	
	public void checkBalance()
	{
		printMessage("Balance left to pay: " + balance);
	}
	
	public String toString()
	{
		return null;
	}
	
	public void showCousrses()
	{
		printMessage ("Maths and English");
		
	}

	public void setPhoneNumber(String number)
	{
		phone = number;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	
	
	
}








