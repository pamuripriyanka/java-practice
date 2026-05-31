package Practice6;

public class CopyArrayTOAnother {

	public static void main(String[] args) 
	{
		// Copy One Array to Another
		
		int arr1[]= {1,2,3,4,5};
		
		int arr2[]= new int[arr1.length]; //A new array arr2 is created with the same size as arr1.
		
		for(int i=0;i<arr1.length; i++) 
		{
			arr2[i] = arr1[i]; //Each element from arr1 is copied into arr2.
		}
		System.out.println("Copied array:");
		
		for(int num: arr2)
		{
			System.out.print(num + " ");
		}
		
		
	}

}
