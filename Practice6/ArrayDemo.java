package Practice6;

public class ArrayDemo 
{

	public static void main(String[] args) 
	{
		int array[]=new int[7];
		
		for(int count=0;count<7l;count++)
		{
			array[count]=count+1;
		}
		for(int count=0;count<7;count++)
		{
			System.out.println("array["+count+"] = "+array[count]);
		}

	}

}
/* output
array[0] = 1
array[1] = 2
array[2] = 3
array[3] = 4
array[4] = 5
array[5] = 6
array[6] = 7
*/
