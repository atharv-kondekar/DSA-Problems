package loops;
import java.util.Scanner;
public class Display_Except_MultipleOf_10 {
	
	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("\nEnter the Number : ");
			int n = sc.nextInt();
			
			if ( n % 10 == 0) {
				System.out.println("You Entreded the Multiple of the 10 ");
				continue ; 
			}
			
			System.out.println("Number = "+n);
			
		}while(true); // Don't use this in the Real life 
	}
}
