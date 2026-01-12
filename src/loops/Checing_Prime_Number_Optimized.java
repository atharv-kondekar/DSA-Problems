package loops;
import java.util.Scanner;
import java.lang.Math;

public class Checing_Prime_Number_Optimized {
	public static void main(String [] agrs ) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		
		int n = sc.nextInt();
		
		if(n == 2 ) {
			System.out.print("The "+n+" is Prime Number");
		}
		else {
			boolean isPrime = true;
			
			for(int i=2 ;i<= Math.sqrt(n) ;i++)
			{
				if ( n%i == 0) {
					isPrime = false;
				}
			}
			
			if(isPrime == true ) {
				System.out.print("The "+n+" is Prime Number");
			}
			else {
				System.out.print("The "+n+" is Not Prime Number");
			}
			
		}
	}
}
