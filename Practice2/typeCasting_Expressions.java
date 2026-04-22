package Practice2;

public class typeCasting_Expressions {

	public static void main(String[] args) {
		
		byte a = 10;
		byte b=20;
		
		//byte c= a + b; - error
		
		byte c = (byte)(a+b);
		System.out.println(c);	
	}

}
