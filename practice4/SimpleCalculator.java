package Practice4;

//very important for exams
/*
import java.util.Scanner;

public class SimpleCalculator 
{

	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
		
			int num=sc.nextInt();
			System.out.print("Enter Operator (+,-,*,/,%): ");
	
			char op=sc.next().charAt(0);
			
			int a=10, b=5; // Fixed values
			
			switch(op)
			{
				case '+': System.out.println(a+b);
				break;
				
				case '-': System.out.println(a-b);
				break;
				
				case '*': System.out.println(a*b);
				break;
				
				case '/': System.out.println(a/b);
				break;
				
				case '%': System.out.println(a%b);
				break;
				
				default: System.out.println("Invalid Operator");
				
			}
	}

}
*/

/*
 * I don't want fixed values.
 * I want to enter values manually for same program
 */

import java.util.Scanner;

public class SimpleCalculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter Operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        switch(op)
        {
            case '+': 
                System.out.println("Result: " + (a + b));
                break;
                
            case '-': 
                System.out.println("Result: " + (a - b));
                break;
                
            case '*': 
                System.out.println("Result: " + (a * b));
                break;
                
            case '/': 
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Cannot divide by zero");
                break;
                
            case '%': 
                if (b != 0)
                    System.out.println("Result: " + (a % b));
                else
                    System.out.println("Cannot mod by zero");
                break;
                
            default: 
                System.out.println("Invalid Operator");
        }

        sc.close();
    }
}



















