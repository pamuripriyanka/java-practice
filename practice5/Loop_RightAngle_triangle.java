package Practice5;

public class Loop_RightAngle_triangle {

	public static void main(String[] args) {
		
		int rows = 5; // number of rows

        // Outer loop controls the number of lines/ outer loops for rows
        for (int i = 1; i <= rows; i++) 
        {
           
            // Inner loop prints stars in each line/ inner loop for stars
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("* ");
            }
            
            // Move to the next line after printing stars
            System.out.println();
        }

	}

}
