package day6;

import java.util.Arrays;

public class SortingArray 
{

	public static void main(String[] args) 
	{
		// Intialize
		
		int arry[]= {5, 2, 8, 1, 3};
		
		Arrays.sort(arry);
		
		System.out.println("Sorted array:");
		
		for(int num:arry)
		{
			System.out.print(num+ " ");
		}
		

	}

}
