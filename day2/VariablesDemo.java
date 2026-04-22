package day2;

public class VariablesDemo 
{
	public static void main(String args[])
	{
		/* Example1 - declaration + assignment
		int a;   //declaration
		a=100;   //assignment
		System.out.println(a);//100
		a=200;
		System.out.println(a);//200
		*/
		
		//Example2 -combined both in one statement
		/*int a =100; //declaration+ assignment in single statement
		//System.out.println(a);
		a=200;
		System.out.println(a);
		*/
		
		//Example3- if all the variable are belongs to same data type
		/*int a=100;
		int b=200;
		int c=300;
		*/
		
		//Example4- if all the variable are belongs to same data type
		/*int a,b,c;//declare variables
		a=100;
		b=200;
		c=300;
		*/
		
		//Example5 - in single statement we defined multiple variables
		int a=100, b=200, c=300;
		System.out.println("The value of a is:"+a);
		System.out.println("the value of b is:" +b);
		System.out.println("the value of c is:"+c);
		
		System.out.println(a+" "+b+" "+c);
	}

}
