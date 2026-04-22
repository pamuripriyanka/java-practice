package day2;

/*
 * Java Objects and class example but instances we are created inside class outside main() method.
 */
public class Dog_OC 
{
	//Instance variables
	
	String breed;
	String color;
	String Size;
	int age;
	
	//Method
	public String getInfo()
	{
		return ("breed: "+breed+" "+"Size: "+Size+ " "+ "Age: "+age+ " "+"Color: "+color);
	}

	public static void main(String[] args) 
	{
		Dog_OC obj = new Dog_OC();
		obj.age=2;
		obj.Size="Small";
		obj.color="White";
		obj.breed="Maltese";
		
		System.out.println(obj.getInfo());
		
	}
}