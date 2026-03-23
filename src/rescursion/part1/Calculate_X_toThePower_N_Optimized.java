package rescursion.part1;
import java.util.Scanner;

public class Calculate_X_toThePower_N_Optimized {

	private static int optimizedPower(int x  , int  n ) { // Takes O(log n)
		
		if(n==0) {
			return 1;
		}
		
		// int halfPowerSq  = optimizedPower(x,n/2) * optimizedPower(x,n/2) ; // Takes ➡️O(n) time 
		// -------->>>>>>> Because of the Call 
		
		int halfPower = optimizedPower(x,n/2);
		int halfPowerSq = halfPower*halfPower;
		
		if( n%2 != 0 ) {
			halfPowerSq = x * halfPowerSq;
		}
		
		return halfPowerSq;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int x = sc.nextInt();
		System.out.print("Enter the Power  : ");
		int  n = sc.nextInt();
		
		System.out.print("The x^n = "+optimizedPower(x,n));
		
		sc.close();
	}

}
