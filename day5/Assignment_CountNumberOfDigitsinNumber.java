package day5;

public class Assignment_CountNumberOfDigitsinNumber 
{

	public static void main(String[] args) 
	{

		/*
		 * count no of digits in a number(looping)
		 * input: 12345
		 * output: 6
		 */
        int number1 = 123456789;
        int count = 0;

        while (number1 != 0) 
        {
            number1 /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);

	}

}
