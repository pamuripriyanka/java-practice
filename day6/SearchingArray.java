package day6;

import java.util.Arrays;

public class SearchingArray 
{

	public static void main(String[] args) 
	{
		// Binary Search Example - Works only on sorted arrays. -found index of Num/Digit.
		
		int arr[]= {1, 3, 5, 7, 9};
		
		int index=Arrays.binarySearch(arr, 5);
				
		System.out.println("Element fount at index: " + index);

	}

}
