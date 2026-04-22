package Practice4;


//Used in student systems

import java.util.Scanner;

public class GradeSystem 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Grade (A/B/C): ");
		
		char grade= sc.next().charAt(0); // reading char
		
		switch(grade)
		{
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
			default:
				System.out.println("Fail");
		}
		sc.close();

	}

}


