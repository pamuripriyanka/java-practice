package Practice6;

public class LargestEleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,20,80,40,50};
		
		int max= arr[0];
		
		for(int i=1; i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Largest = " + max);

	}

}
