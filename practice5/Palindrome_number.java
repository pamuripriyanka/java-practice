package Practice5;

public class Palindrome_number 
{

	public static void main(String[] args) 
	{
		/*palindrome number
		 * input: 121
		 * output: 121
		 * 
		 *  input1: 4554
		 *  output: 4554
		 */
		
		int num = 4534;
		int Original = num;
		int Reversed =0;
		
		while(num > 0)
		{
			int digit=num%10;  // extract the value
			Reversed=Reversed*10+digit; //build the reverse number
			num /= 10;  //remove last digit
			
		}
		if(Original == Reversed)
		{
			System.out.println(Original +" is a palindrome");
		}
		else
		{
			System.out.println(Original+" is not a palindrome");
		}
		

	}

}
