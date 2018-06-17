package OOP;

class Person
{
	String name;
	String age;
	
	void walk(){
		System.out.println(name + "is walking");
	}
	void age(){
		System.out.println("Age of " + name + " is: " + age);
	}
	
}
public class Demo {
public static void main (String [] args)
{
	Person p1 = new Person();
	p1.name = "Harry";
	p1.age = "22";
	
	Person p2 = new Person();
	p2.name = "Tom";
	p2.age = "32";
	
	p1.walk();
	p2.age();
}
}
