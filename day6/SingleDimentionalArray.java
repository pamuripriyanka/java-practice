package day6;

import java.util.Arrays;

public class SingleDimentionalArray 
{

	public static void main(String[] args) 
	{
		/*
		 * Declare an array 
		 * Add values into array 
		 * Find size of an array 
		 * read single value from an array 
		 * read multiple values from an array
		 */
		
		//Declaring array - Approach1
		/*
		int a[]=new int[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		*/
		
		//Declaration + assign data - Approach2
		
		int a[]= {10,20,30,40,50};
		
		//Find size of an array
		System.out.println(a.length); //5
		
		//read single value from an array 
		System.out.println(a[0]); //10
		System.out.println(a[4]);
		
		//read multiple values from an array
		System.out.println(Arrays.toString(a)); //[10, 20, 30, 40, 50]
		
		/*
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		*/
		
		//Enhanced for loop / for..each loop
		for(int x:a)
		{
			System.out.println(x);
		}
	}

}
