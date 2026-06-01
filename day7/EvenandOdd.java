package day7;

public class EvenandOdd 
{

	public static void main(String[] args) 
	{
		int arr[]= {10,30,9,8,50,22,46};
		
		int even=0;
		int odd=0;
		/*
		for(int value:arr)
		{
			if(value%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		*/
		
		for(int i=0;i< arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("Number of even numbers:"+ even);
		System.out.println("Number of odd numbers:"+ odd);

	}

}
