package patterns_Advanced;
import java.util.Scanner;

/*
    *****
   *****
  *****
 *****
*****

*/
public class Solid_Rhombus_Pattern {
	
	private static void printRhombusPattern(int rows )
	{
		for(int i = 1 ; i <= rows ; i++ )
		{
			//For the Space 
			for(int j=1 ; j<= rows-i ; j++ )
				System.out.print(" ");
			
			//For the "*"
			for(int j=1 ; j<=rows ; j++ )
				System.out.print("*");
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Rows : ");
		int rows = sc.nextInt();
		
		printRhombusPattern(rows);
		
		sc.close();
	}

}
