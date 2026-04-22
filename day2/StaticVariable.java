/*
 * Static Variable: Declared with the static keyword inside a class
 * Shared among all objects of the class
 * It can be accessed using the class name without creating an object.
 */

package day2;

public class StaticVariable 
{
	
	static int staticVar =30; //Static variable
	
	public void show()
	{
		System.out.println("static variable is:"+staticVar);
	}

	public static void main(String[] args) 
	{
		StaticVariable obj1=new StaticVariable();
		StaticVariable obj2=new StaticVariable();
		
		obj1.show();
		obj2.show();
		
		//changing static variable affects all objects
		
		StaticVariable.staticVar=50;
		obj1.show();
		obj2.show();
	}

}
