package Practice2;

public class Char_TypeCasting 
{

	public static void main(String[] args) 
	{
		char letter = 'A';
		int ascii=letter;
		System.out.println("Convert char to int: "+ascii);
		
		
		//convert int to char
		
		int num = 66;
		char ch= (char) num;
		
		System.out.println("Convert to char:"+ch);
	}

}

