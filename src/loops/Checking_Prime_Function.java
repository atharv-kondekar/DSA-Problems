package loops;
import java.util.Scanner;
import java.lang.Math;

public class Checking_Prime_Function {
	
	public static boolean isPrime(int n)
	{
		boolean prime = true;
		
		if(n==2){
			return true;
		}
		
		else{
			
			for(int i = 2 ; i<= Math.sqrt(n) ; i++ )
			{
				if(n%i == 0)
				{
					prime = false;
					break;
				}
			}
		}
		
		return prime;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		
		if(isPrime(n))
		{
			System.out.print("The Number "+n+" is PRIME ");
		}
		else {
			System.out.print("The Number "+n+" is NOT PRIME ");
		}
	}

}
