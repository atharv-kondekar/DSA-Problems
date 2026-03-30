package rescursion.part2;

import java.util.Scanner;

public class Tilling_Problem {

	private static int tillingProblem(int n ) {
		
		if( n==1 || n==0 ) {
			return 1;
		}
		
		//Vertical
		int fnm1 = tillingProblem(n-1);
		
		//Horizontal
		int fnm2 = tillingProblem(n-2);
		
		int ways = fnm1 + fnm2;
		
		return ways;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Breadth of the Floor : ");
		int n = sc.nextInt();
		
		System.out.print("The Total number of ways we can place the tile is : "+tillingProblem(n));
		
		sc.close();
	}

}
