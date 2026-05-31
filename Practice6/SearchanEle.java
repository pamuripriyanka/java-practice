package Practice6;

public class SearchanEle 
{

	public static void main(String[] args) 
	{
		
		//Linear Search 
		
		int arr[]= {10,20,30,40,50};
		
		int key=90;
		
		boolean found=false;
		
		for(int num: arr)
		{
			if(num == key)
			{
				found=true;
				break;
			}
		}
		if(found)
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not found");
		}
	}

}
