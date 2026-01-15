package loops;
import java.util.Scanner;

/*
 	 nCr =n! / (r! * (n−r)! )​​
 	 
 	 n
 	 	Total number of distinct items
		Example: total students, total balls, total elements
		Constraint:
		 			n≥0
	r
		Number of items you choose
		Order does NOT matter
		Constraint:
					0≤r≤n
	nCr
		Number of combinations
		“How many ways can I choose r items from n items without order”
*/

public class Binomial_Coefficient {

	private static double binomialCoefficient(int n , int r ) {
		int n_fact = factorial(n);
		int r_fact = factorial(r);
		int n_r_fact = factorial(n-r);
		
		return (double) ( n_fact / (r_fact * n_r_fact ) );
	}
	
	private static int factorial(int num) {
		int fact = 1;
		
		for(int i=num ; i>=1 ; i--) {
			fact = fact * i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Total Numbers (n) : ");
		int n =  sc.nextInt();
		System.out.print("Enter the Number of items you choose(r) : ");
		int r =sc.nextInt();
		
		System.out.print("The number of combinations : "+binomialCoefficient(n,r));
	}

}
