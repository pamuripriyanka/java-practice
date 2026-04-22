package day5;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		/*Example1
		 
			int i=1;    //Initialization
			while(i<=10) //Condition
			{
				System.out.println(i);
				i++;     //Increment
			}
		*/
		
		/*Example2 - want to print "Hello" 10 times
		
			int i=1;
			while(i<=10)
			{
				System.out.println(i+" "+"Hello");
				i++;
			}
		*/
		
		//Example3 -print even numbers 1-10
		/* Method1 
		int i=2;
		while(i<=10)
		{
			System.out.println(i);
			i+=2;      //i=i+2;
		}
		*/
		
		//Method2
		/*
		int i=1;
		while(i<=10)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}		
		*/
		/*
		//odd numbers
		int i=1;
		while(i<=10)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			i++;
		}
		*/
		
		//example4- print 10 9 8 --1 in descending order
		
		int i=10;
		
		while(i>=1)
		{
			System.out.println(i);
			i--;
		}
		
		/*
		//example5
		while(1==1)
		{
			System.out.println("Hello");
		}
		*/
	}

}
