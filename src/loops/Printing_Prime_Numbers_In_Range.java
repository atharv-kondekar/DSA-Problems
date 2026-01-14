package loops;
import java.util.Scanner;
import java.lang.Math;

public class Printing_Prime_Numbers_In_Range {
	
	private static void primeInRange(int range) {
		
		for(int i = 2 ; i<= range ; i++ )
		{
			if( isPrime(i) )
			{
				System.out.print(" "+i);
			}
			else {
				continue;
			}
		}
	}
	
	private static boolean isPrime(int n)
	{
		boolean prime = true;
		
		if(n == 2) {
			return true;
		}
		else
		{
			for(int i = 2 ; i <= Math.sqrt(n) ; i++) {
				
				if(n % i == 0 )
				{
					prime = false;
				}
			}
		}
		
		return prime;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Range : ");
		int range = sc.nextInt();
		
		primeInRange(range);
	}

}
