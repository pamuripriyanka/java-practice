package Practice3;

import java.util.Scanner;

public class Scanner_ReadstringInput 
{

	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("Enerter your name: ");
		String name = sc1.next(); //Read Single word input
		
		System.out.println("hello.."+name);

	}

}
