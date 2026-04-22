package Practice4;


//Note: Case sensitive, used in login systems and permissions

public class StringInSwitch 
{

	public static void main(String[] args) 
	{
		String str="admin";
		
		switch(str)
		{
		case "admin":
			System.out.println("Full access");
			break;
		case "user":
			System.out.println("Limited access");
			break;
		case "guest":
			System.out.println("view only");
			break;
			default:
				System.out.println("Unknown role");
			
		}

	}

}
