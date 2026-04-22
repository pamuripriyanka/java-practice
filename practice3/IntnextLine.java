package Practice3;

import java.util.Scanner;

public class IntnextLine 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		
		//sc.nextLine();   //clear buffer (important!)
		
		System.out.println("Enter your full name: ");
		String Fullname=sc.nextLine();
		
		System.out.println("Age: "+age);
		System.out.println("name: "+Fullname);
	}
}
