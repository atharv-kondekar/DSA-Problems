package patterns_Advanced;
import java.util.Scanner;

public class Inverted_Half_Pyramid_With_Numbers {

	private static void printInvertedHalfPyramidWithNumbers(int rows) {
		//For the rows
		for(int i = 1 ; i <= rows ; i++ )
		{
			// For the Numbers in the Each line
			for(int j = 1 ; j <= (rows-i)+1 ; j++ )
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows : ");
		int rows = sc.nextInt();
		
		printInvertedHalfPyramidWithNumbers(rows);
	}

}
