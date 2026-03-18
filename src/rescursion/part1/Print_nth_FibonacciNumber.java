package rescursion.part1;

public class Print_nth_FibonacciNumber {

	private static int fibonacci(int n ) {
		if( n==0) {
			return 0;
		}
		if( n==1 ) {
			return 1;
		}
		
		int fib_n_1 = fibonacci(n-1);
		int fib_n_2 = fibonacci(n-2);
		
		return fib_n_1 + fib_n_2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 6;
		System.out.print("The "+n+"th Fibonacci Number is : "+fibonacci(n));
	}

}
