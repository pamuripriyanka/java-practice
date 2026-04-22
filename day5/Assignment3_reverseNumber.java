package day5;

public class Assignment3_reverseNumber {

	public static void main(String[] args) 
	{
		/*
		 * reverse a number using (% / = operators)
		 * input: 1234
		 * output:4321
		 */
		
		int number=1234;
		int reversenum=0;
		
		while(number!=0)
		{
			int reminder =number%10; // extracts the value
			reversenum =reversenum*10+reminder; //build reverse number
			number=number/10;  //to remove last digit from the number
		}
		System.out.println("reversed number: "+reversenum);
		
		/*
		 * palindrome number (conditional statements + looping statements)
		 * input : 121
		 * after reversing- 121
		 */
		int num = 454;   // number to check
        int original = num; // store original number
        int reversed = 0;

        while (num != 0) 
        {
            int digit = num % 10;          // extract last digit
            reversed = reversed * 10 + digit; // build reversed number
            num = num / 10;                // remove last digit
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }

	}

}
