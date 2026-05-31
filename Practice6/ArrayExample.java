package Practice6;

public class ArrayExample 
{

	public static void main(String[] args) 
	{
		//#1 Declaring your array
		
			int intArray[];
				
			//int []intArray;
		
		//#2 Constructing an array - syntax
		//arrayName =new dataTyoe[];
		
			intArray =new int[10];
			
		//Declaration and construction combined 
		
			//	int intArray[]=new int[10];
			
		//#3 Intialize an Array
			
			intArray[0]=10;
			intArray[1]=20;
			intArray[2]=30;
			intArray[3]=40;
			intArray[4]=50;
			intArray[5]=60;
			intArray[6]=70;
			intArray[7]=80;
			intArray[8]=90;
			intArray[9]=100;
			
		//#4 Declaring and Intialization combined -another approach of above example
			
			int intArray1[]= {10,20,30,40,50,60,70,80,90,100};
			//System.out.println(intArray1.length);
			
		//Read the values from the array
			
			for(int i=0;i<intArray1.length;i++)
			{
				System.out.println(intArray1[i]);
			}
			
		//for..each loop
			
			for(int z:intArray1)
			{
				System.out.println(z);
			}
			
	}
}