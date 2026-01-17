package patterns_Advanced;
import java.util.Scanner;

public class Floyds_Triangle_Pattern {
	
	private static void printFloydsTrianglePattern(int rows)
	{
		int number = 1;
		
		// Outer loop - for the Rows
		for(int i = 1 ; i <= rows ; i++ )
		{
			// for printing the Number for each line
			for(int j=1 ; j <= i ; j++ )
			{
				System.out.print(number++);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number of rows : ");
		int rows = sc.nextInt();
		
		printFloydsTrianglePattern(rows);
		
		sc.close();
	}
}
