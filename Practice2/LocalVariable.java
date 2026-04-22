package Practice2;

public class LocalVariable 
{
	
	public void display()
	{
		int locVar=10; //local variable
		System.out.println("Local variable is: "+locVar);
	}
	public static void main(String[] args) 
	{
		
		LocalVariable obje=new LocalVariable();
		obje.display();
	}

}
