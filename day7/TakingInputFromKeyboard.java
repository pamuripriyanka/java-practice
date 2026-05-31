package day7;

import java.util.Scanner;

public class TakingInputFromKeyboard 
{

	public static void main(String[] args) 
	{
			//int a=100; // hard code value
		
		Scanner sc=new Scanner(System.in);
		
		//Integer
		System.out.println("Enetr a number");
		int a=sc.nextInt();
		System.out.println("Give value of a is:"+a);
		
		//Decimal
		System.out.println("Enter a decimal number: ");
		double b=sc.nextDouble();
		
		System.out.println("Give value of b is:"+b);
		
		//String
		System.out.println("Enter a String/your Name: ");
		String name=sc.next();
		System.out.println("your name is:"+name);
	}

}
