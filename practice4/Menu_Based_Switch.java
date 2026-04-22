package Practice4;

// used in  calculators, ATM menus, apps

import java.util.Scanner;

public class Menu_Based_Switch 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
 
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("Enter choice: ");
		
		int choice=sc.nextInt();
		
		int a=10, b=5;
		
		switch(choice) 
		{
		
			case 1:
				System.out.println("Sum =" +(a+b));
				break;
			case 2:
				System.out.println("Difference =" +(a-b));
				break;
				
			default:
				System.out.println("Invalid choice");
		}
	}

}
