package day7;

public class FindDuplicateNuminArray 
{

	public static void main(String[] args) 
	{
			int arr[]= {10,20,10,30,10,40,10,50,80,10};
			
			int num=10;
			
			int count=0;
			
			for(int value:arr)
			{
				if(value == num)
				{
					count++;
				}
			}
			System.out.println("Number od times repeated: " +count);

	}

}
