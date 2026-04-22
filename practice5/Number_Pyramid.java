package Practice5;

public class Number_Pyramid 
{	
    public static void main(String[] args) 
    {
        int rows = 5; // number of rows

	    for (int i = 1; i <= rows; i++)  // loop for rows
	    {        
	        
	        for (int j = 1; j <= rows - i; j++) // print spaces to align pyramid
	        {
	            System.out.print(" ");
	        }
	        
	        for (int k = 1; k <= i; k++) // print numbers in each row
	        {
	            System.out.print(k + " ");
	        }
	        System.out.println(); // move to next line
	    }
    }

}
