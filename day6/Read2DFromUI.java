package day6;

import java.util.Scanner;

public class Read2DFromUI 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int rows=3;
		int cols=3;
		
		int  arr[][]=new int[rows][cols];
		
		//Input values
		System.out.println("Enter 9 elements:");
		
		for(int row=0; row<rows; row++)
		{
			for(int col=0;col<cols; col++)
			{
				arr[row][col]=sc.nextInt();
			}
		}
		//Display values
		System.out.println("Matrix");
		
		for(int row=0; row<rows; row++)
		{
			for(int col=0;col<cols; col++)
			{
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
