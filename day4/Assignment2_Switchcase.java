package day4;

public class Assignment2_Switchcase {

	public static void main(String[] args) {
		
		//Assignment -Print week no based on week name (switch)
		
		String weekname="Saturday";
		
		switch(weekname)
		{
		case "Sunday":System.out.println(1);break;
		case "Monday":System.out.println(2);break;
		case "Tuesday":System.out.println(3);break;
		case "Wednday":System.out.println(4);break;
		case "Thursday":System.out.println(5);break;
		case "Friday":System.out.println(6);break;
		case "Saturday":System.out.println(7);break;
		default:System.out.println("Invalid week number");
		}

	}

}
