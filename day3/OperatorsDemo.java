package day3;

public class OperatorsDemo 
{
	public static void main(String args[])
	{
		
		//1)Arithmetic operators + - * / %
		
		int a=20, b=10;
		//this is wrong way to do addition-System.out.println("Sum of a and b is:"+a+b);
		System.out.println("Sum of a and b is:"+(a+b));
		System.out.println("substraction of a and b is:"+(a-b));
		System.out.println("multiplication of a and b is:"+(a*b));
		System.out.println("division of a and b is:"+(a/b));
		System.out.println("Modular of a and b is:"+(a%b));
		
		//2 Relational or comparison operators > < >= <= != ==
		//returns boolean values - true or false
		
		System.out.println(a>b); //true
		System.out.println(a<b); //false
		System.out.println(a<=b); //false
		System.out.println(a>=b); //true
		System.out.println(a==b); //false
		System.out.println(a!=b); //true
		
		//3 Logical Operators && || !
		
		boolean x = true;
		boolean y= false;
		
		System.out.println(x&&y); //false
		System.out.println(x||y); //true
		System.out.println(!x); //false
		System.out.println(!y); //true
	
	}

}
