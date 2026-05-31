package day6;

public class TwoDimentionalArray 
{

	public static void main(String[] args) 
	{
		/*
			Declare an Array
			add values into array
			find size of an array
			read single value  from an array
			read multiple values from an array
		 */
		
		//declaration and adding values, Approach1
		
		//int a[][]=new int[3][2];
		/*
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=200;
		a[1][1]=200;
		
		a[2][0]=200;
		a[2][1]=200;
		*/
		
		//Appraoch2
		int arr[][]= { {100,200}, 
					 {300,400}, 
					 {500,600}
				   };
		
		//Find size of an array
		
		System.out.println(arr.length);
		
		System.out.println(arr[0].length); //returns no of columns in specific row
		
		//how to read a single value  from an array
		System.out.println(arr[1][1]);
		
		System.out.println("-------------------------------------------------------------------------------------------");
		//Read all the rows and columns 
		
		for(int row=0; row<arr.length;row++)
		{
			for(int col=0; col< arr[row].length; col++)
			{
				System.out.print(arr[row][col]+ " ");
			}
			System.out.println(); //Move to next row
		}
		
	}

}
