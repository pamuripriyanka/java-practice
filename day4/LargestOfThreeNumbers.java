package day4;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		/*
		 * a=10,b=20, c=30
		 * 
		 * a>b and a>c -> a is largest
		 * b>a and b>c -> b is largest
		 * c>a and c>b -> c is largest
		 */
		
		int a=50, b=40, c=30;
		
		if(a>b && a>c)
		{
			System.out.println("a is the largest number");
		}
		else if( b>a && b>c)
		{
			System.out.println("b is the largest number");
		}
		else
		{
			System.out.println("C is the largest number");
		}

	}

}
