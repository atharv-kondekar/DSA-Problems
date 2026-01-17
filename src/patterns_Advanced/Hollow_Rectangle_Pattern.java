package patterns_Advanced;
import java.util.Scanner;
/*
 	*****
 	* 	*
 	*	*
 	*****
*/
public class Hollow_Rectangle_Pattern {
	
	private static void printHollowPattern(int rows,int cols) {
		//Outer loops
		for(int i=1 ; i<= rows ; i++) {
			//inner Loop
			for(int j =1 ; j <= cols ; j++) {
				
				// Condition
				if(i==1 || i==rows || j==1 || j==cols) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of rows : ");
		int i = sc.nextInt();
		
		System.out.print("Enter teh Number of cols : ");
		int j = sc.nextInt();
		
		printHollowPattern(i,j);
		
		sc.close();
	}

}
