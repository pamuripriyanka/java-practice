package day7;

public class PrintEvenandOddNum 
{

	public static void main(String[] args) 
	{
		int arr[]= {12, 23, 45, 66, 34, 15, 9};
		
		System.out.println("Even numbers: ");
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+ " ");
			}
		}
		
		//Odd numbers
		System.out.println("\nOdd numbers: ");
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 !=0)
			{
				System.out.print(arr[i]+ " ");
			}
		}
		

	}

}
