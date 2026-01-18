package patterns_Advanced;

import java.util.Scanner;

public class Hollow_Rhombus_Pattern {
	
	//Approach 1
	private static void printHollowPattern(int rows )
	{
		for(int i = 1 ; i <= rows ; i++)
		{
			for(int j = 1 ; j <= rows-i ; j++)
				System.out.print(" ");
			if( i==1 || i==rows ) {
				for( int j =1 ; j<=rows ; j++)
					System.out.print("*");
			}
			
			else {
				System.out.print("*");
				for(int j=1;j<= rows-2 ; j++ )
					System.out.print(" ");
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Rows : ");
		int rows = sc.nextInt();
		
		System.out.print("\nApproach 1 : \n\n");
		printHollowPattern(rows);
		
		System.out.print("-------------------------------------");
		//Approach 2 is better
		System.out.print("\nApproach 2 : \n\n");
		printHollowPattern2(rows);
		
		sc.close();
	}
	
	//Approach 2
	private static void printHollowPattern2(int rows )
	{
		for(int i = 1 ; i<= rows ; i++)
		{
			for(int j=1 ; j<= rows-i ;j++)
				System.out.print(" ");
			
			// Hollow Rectangle code : Hollow Rohmbus is nothing but hollow Rectangle 
			for(int j = 1 ; j<= rows ; j++ )
			{
				if( i==1 || i==rows || j==1 || j==rows)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}
