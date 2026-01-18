package patterns_Advanced;

import java.util.Scanner;
/*
	  *
	 ***
	*****
	*****
	 ***
	  *
*/
public class Diamond_pattern {
	
	private static void diamondPattern(int rows)
	{
		for(int i = 1 ;i <= rows ; i++)
		{
			for(int j =1 ; j<=rows-i ;j++)
				System.out.print(" ");
			
			//For the * = we use the Quadratic Equation
			// odd --->  2x+1 or 2x-1 
			// "2x-1" is fits for us , so "(2*i)-1" 
			for(int j=1 ; j<= (2*i)-1 ; j++)
				System.out.print("*");
			
			System.out.println();
		}
		for(int i = rows ;i >= 1 ; i--)
		{
			for(int j =1 ; j<=rows-i ;j++)
				System.out.print(" ");
			for(int j=1 ; j<= (2*i)-1 ; j++)
				System.out.print("*");
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Rows : ");
		int rows = sc.nextInt();
		
		diamondPattern(rows);
		
		sc.close();
	}

}
