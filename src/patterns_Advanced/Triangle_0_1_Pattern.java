package patterns_Advanced;

import java.util.Scanner;

public class Triangle_0_1_Pattern {
	
	// Apporach 1
	private static void print_01TrianglePattern(int rows)
	{
		int n =1;
		for(int i = 1; i <= rows ; i++)
		{
			if(i%2==0) {
				n=0;
			}
			else {
				n=1;
			}
			
			for(int j = 1 ; j<= i ; j++)
			{
				System.out.print(n);
				if(n==1)
					n=0;
				else
					n=1;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number of rows : ");
		int rows = sc.nextInt();
		
		System.out.print("Apporach 1 :\n");
		print_01TrianglePattern(rows);
		System.out.print("\n -------------------------------------------\n");
		System.out.print("Apporach 2 :\n");
		print_01TrianglePattern02(rows);
	}
	
	// Apporach 2 = is better 
	private static void print_01TrianglePattern02(int rows)
	{
		
		for(int i = 1; i <= rows ; i++)
		{	
			for(int j = 1 ; j<= i ; j++)
			{
				if( (i+j)%2==0 )
					System.out.print(1);
				else
					System.out.print(0);
			}
			System.out.println();
		}
	}

}
