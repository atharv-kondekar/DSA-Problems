package rescursion.part1;

public class Factorial_Of_Number {

	private static int factorial(int n ) {
	
		if(n == 0 ) {
			return 1;
		}
		
		return n * factorial(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 1 ; 
		System.out.print("Factorial : "+ factorial(n));
	}

}
