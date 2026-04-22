package day4;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		/*
		 	To reduce the no of line code
		 	Syntax:
		 			switch(variable)
		 			{
		 				case value1: statements;
		 							 break;
		 				case value2: statements;
		 							 break;
		 				default:     statements;
		 			}
		 */
		
		int weekno=1;
		
		switch(weekno)
		{
		case 1: System.out.println("Monday");
				break;
		case 2: System.out.println("Tuesday");
				break;
		case 3: 	System.out.println("Wednsday");
				break;
		case 4: System.out.println("Thursday");
				break;
		case 5: System.out.println("Friday");
				break;
		case 6: System.out.println("Saturday");
				break;
		case 7: System.out.println("Sunday");
				break;
		default:System.out.println("Invalid week number");
		}
	
	}

}
