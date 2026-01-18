package patterns_Advanced;
import java.util.Scanner;
/* 
		*      *      
		**    **
		***  ***
		******** rows = 4 
		********
		***  ***
		**    **
		*      *
*/
public class Butterfly_Pattern {
	private static void printButterflyPattern(int rows)
	{
		//1st half 
		for(int i = 1 ;i<= rows ;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print("*");
			for(int j=1 ; j<= 2*(rows-i) ; j++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print("*");
			
			System.out.println();
		}
		
		//2nd half
		for(int i = rows ; i>=1 ;i--)
		{
			for(int j=1;j<=i;j++)
				System.out.print("*");
			for(int j=1 ; j<= 2*(rows-i) ; j++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print("*");
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Rows : ");
		int rows = sc.nextInt();
		
		printButterflyPattern(rows);
		
		sc.close();
	}

}
