package loops;
import java.util.Scanner;

public class Reverse_Number {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		
		System.out.print("Reversed Number : ");
		while( n > 0 ) {
			int last_digit = n % 10 ; // Take last digit  
			
			System.out.print(last_digit); // print the last digit
			
			n = n / 10 ; // remove the last digit 
		}
	}
}
