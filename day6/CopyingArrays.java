package day6;

import java.util.Arrays;

public class CopyingArrays 
{

	public static void main(String[] args) 
	{
		
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		
		int[] copy =Arrays.copyOf(arr, arr.length);
		System.out.println("Copied array: ");
		
		for(int num: copy)
		{
			System.out.print(num + " ");
		}

	}

}
