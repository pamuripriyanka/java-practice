package Practice5;

public class FactorialNumber {

	public static void main(String[] args) {
		
		/*
		 * Factorial means 
		 * 5! = 5x4x3x2x1 = 120
		 * n!=nx(n-1)x(n-2)...1
		 */
		
		int num=5;
		long factorial =1;
		
		for(int i=1;i<=num;i++)
		{
			factorial=factorial*i; //multifly current value
		}
		System.out.println("factorial of " + num + " is " +factorial);
	}

}
