package Practice3;

import java.util.Scanner;

public class Reading_Multiplelines 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First name: ");
		String fn=sc.nextLine();
		
		System.out.println("Enter Last name: ");
		String ln=sc.nextLine();
		
		System.out.println("Full name: "+fn+ " "+ln);

	}

}
