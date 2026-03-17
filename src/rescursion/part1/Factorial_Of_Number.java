package rescursion.part1;
import java.util.Scanner;

public class Factorial_Of_Number {

	private static int factorial(int n ) {
	
		if(n == 0 ) {
			return 1;
		}
		
		return n * factorial(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Enter the Number : ");
		n = sc.nextInt();
		System.out.print("Factorial : "+ factorial(n));
		sc.close();
	}

}
