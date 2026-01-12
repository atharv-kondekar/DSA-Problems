package loops;
import java.util.Scanner;

public class Checking_Prime_Number {
	
	public static void main(String [] args ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enetr the Number : ");
		int n = sc.nextInt();
		
		if( n == 2 ) 
		{
			System.out.print("The "+n+" is Prime Number");
		}
		else
		{
			boolean isPrime = true;
			
			for(int i = 2 ; i<= n-1 ;i++) {
				if( n%i == 0) {
					isPrime=false;
				}
			}
			
			if(isPrime == true) {
				System.out.print("The "+n+" is Prime Number");
			}
			else {
				System.out.print("The "+n+" is Not Prime Number");
			}
		}
	}
}
