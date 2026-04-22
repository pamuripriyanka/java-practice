package day4;

public class EvenOddNumIFCondition 
{
	public static void main(String args[])
	{
		//Even which means number is divided by 2 and 0 as a reminder, it will divided by % itself.So, the logic is
		
		int num=25;
		
		if(num%2 == 0)
		{
			System.out.println(num+" is Even number");
		}
		else
		{
			System.out.println(num+" is Odd number");
		}
	}
}
