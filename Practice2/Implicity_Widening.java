/*
 * Implicit type casting(Widening) : Automatically done by Java
 * Converying smaller data type -> larger data type
 * 
 * Memory size of Data Types
 * 
 * byte -> 1 byte
 * short -> 2 byte
 * int -> 4 bytes
 * long -> 8 bytes
 * float -> 4 bytes
 * double -> 8 bytes
 * char -> 4 bytes
 * 
 * Widening Order
 * 
 * byte - short - int - long - float - char
 */

//smaller datatype to larger data type
package Practice2;

public class Implicity_Widening 
{

	public static void main(String[] args) 
	{
		
		int num= 24;
		double result = num; //Automatic casting
		
		System.out.println("Convert int to double: "+result);
		
	}

}


