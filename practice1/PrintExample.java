/*
 * How to print using entered data in Java

How to print using entered data in Java

The following steps show us to print entered data.

Step 1) Use the Java scanner package to support user input data.

Step 2) A Scanner class or object operates to accept input from standard input. It enters through the keyboard.

Step 3) Create the variable using the “Scanner(System.in)” method.

Step 4) Use the variable. nextInt() then reads all values from the keyboard.

Step 5) this method gets input data until it encounters a new line character (Enter).

Step 6) Finally, the input value prints the normal output using the System.out.print() function.
 */

package Practice1;

import java.util.Scanner;

public class PrintExample 
{
	public static void main(String args[])
	{
		Scanner reader_data = new Scanner(System.in);
		System.out.print("Enetr a value: ");
		int number_data = reader_data.nextInt();
		System.out.println("User entered: "+number_data);
		int add=number_data+number_data;
		System.out.println("Addition " + add);
	}

}
