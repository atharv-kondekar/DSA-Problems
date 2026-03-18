package rescursion.part1;
import java.util.Scanner;
public class Print_nth_FibonacciNumber {

	private static int fibonacci(int n ) {
		if( n==0) {
			return 0;
		}
		if( n==1 ) {
			return 1;
		}
		
		// Formula=>  "fib(n) = fib(n-1) + fib(n-2)"
		int fib_n_1 = fibonacci(n-1); // fib(n-1)
		int fib_n_2 = fibonacci(n-2); // fib(n-2)
		
		int fibN = fib_n_1 + fib_n_2; //"fib(n) = fib(n-1) + fib(n-2)" 
		return fibN;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		
		System.out.print("The "+n+"th Fibonacci Number is : "+fibonacci(n));
		
		sc.close();
	}

}
