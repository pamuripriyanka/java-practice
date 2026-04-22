package Practice2;

class Dog_main
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
}
public class Dog {

	public static void main(String[] args) {
		
		Dog_main obj = new Dog_main();
		obj.age=2;
		obj.Size="Small";
		obj.color="White";
		obj.breed="Maltese";
		
		System.out.println(obj.getInfo());	

	}

}
