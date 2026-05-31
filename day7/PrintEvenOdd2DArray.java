package day7;

public class PrintEvenOdd2DArray 
{

	public static void main(String[] args) 
	{
		 int[][] arr = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };

		        System.out.println("Even Numbers:");
		        for (int i = 0; i < arr.length; i++) 
		        {
		            for (int j = 0; j < arr[i].length; j++) 
		            {
		                if (arr[i][j] % 2 == 0) 
		                {
		                    System.out.print(arr[i][j] + " ");
		                }
		            }
		        }

		        System.out.println("\nOdd Numbers:");
		        for (int i = 0; i < arr.length; i++) 
		        {
		            for (int j = 0; j < arr[i].length; j++) 
		            {
		                if (arr[i][j] % 2 != 0) 
		                {
		                    System.out.print(arr[i][j] + " ");
		                }
		            }
		        }
	}

}
