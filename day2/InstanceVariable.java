/*
 * Instance Variable:Declared inside class but outside any method/constructor.
 * Each object has it's own copy.
 */

package day2;

public class InstanceVariable 
{
	int instanceVar = 100; //Instance variable1
	
	public void show()
	{
		System.out.println("Instance variable is:"+instanceVar);
	}

	public static void main(String[] args) 
	{
		InstanceVariable obj1=new InstanceVariable();
		InstanceVariable obj2=new InstanceVariable();
		
		obj1.show();
		obj2.show();

	}

}
