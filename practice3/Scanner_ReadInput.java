package Practice3;

import java.util.Scanner;

public class Scanner_ReadInput 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=sc.nextInt(); //Reading the Integer input
		
		System.out.println("You Entered number: "+num);

	}

}

/*
Summary
Scanner is used for user input
Use nextInt(), next(), nextLine() based on need
Be careful with newline issues
Combine with System.out for input/output programs
*/