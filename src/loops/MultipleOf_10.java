package loops;
import java.util.Scanner;

public class MultipleOf_10 {
	
	public static void main(String[] agrs) {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("\nEnter the Number : ");
			int n = sc.nextInt();
			
			if ( n % 10 == 0) {
				System.out.println("You Entreded the Multiple of the 10 ");
				break ; 
			}
			
			System.out.println("Number = "+n);
			
		}while(true);
	}
}
