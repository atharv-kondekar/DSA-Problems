package rescursion.part1;
import java.util.Scanner;

public class Calculate_X_toThePower_N {

	private static int calculatePower(int x , int n ) {
		
		if( n == 0 ) {
			return 1;
		}
		
		return x * calculatePower(x,n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int x = sc.nextInt();
		System.out.print("Enter the Power  : ");
		int  n = sc.nextInt();
		
		System.out.print("The x^n = "+calculatePower(x,n));
		
		sc.close();
	}

}
