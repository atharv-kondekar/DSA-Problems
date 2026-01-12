package loops;
import java.util.Scanner;

public class Make_Rreverse_Number {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		
		int rev = 0 ;
		
		while(n > 0 ) {
			int last_digit = n % 10; //Take the Last digit 
			
			rev = ( rev * 10 ) + last_digit; 
			/*
			  * rev * 10 =  shifts all digits of rev one place to the left
			  * creating space at the unit place.
			  * 
			 * +last_digit = add the last_digit to that unit place 
			 * */
			
			n /= 10;
		}
		
		System.out.print("The Reversed Number : "+rev);
	}
}
