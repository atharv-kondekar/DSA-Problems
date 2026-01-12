package loops;
import java.util.Scanner;

// Here we are just printing it , not making the reverse 

public class Just_Print_Reverse_Number {
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
