package patterns_Advanced;
import java.util.Scanner;
public class Inverted_Roated_Half_Pyramid {
	
	private static void printInvertedRoatedHalfPyramid(int rows) {
		
		//Outer loop - for the Rows 
		for(int i = 1 ; i<= rows ; i++) {
			
			// For printing the Spaces
			for(int j = 1 ; j <= rows-i ; j++) {
				System.out.print(" ");
			}
			
			// For printing the "*"
			for(int j=1 ;j<=i ; j++) {
				System.out.print("*");
			}
			
			//For next line
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number of rows : ");
		int rows = sc.nextInt();
		
		printInvertedRoatedHalfPyramid(rows);
		
	}

}
