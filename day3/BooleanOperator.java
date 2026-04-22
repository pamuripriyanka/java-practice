package day3;

public class BooleanOperator {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
				// this expression is correct 
		
				boolean b1= 10>20; 
				System.out.println(b1); // false
				
				boolean b2 = 20>10;
				System.out.println(b2); //true
				
				System.out.println(b1 && b2); // false
				System.out.println(b1 || b2); // true
				
				System.out.println( (10<20) && (20>10)); //true
				System.out.println( (10<20)||(20>10)); //true
				
				System.out.println( !(10<20)); //false 

	}

}
