package Practice6;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,20,30,40,50};
		
		int sum=0;
		 int i=0;
		 
		 while(i<arr.length)
		 {
			 sum= sum+arr[i];
			 i++;
		 }
		 System.out.println("Sum = "+ sum);

	}

}
