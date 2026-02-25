package bit_manipulation;
import java.util.Scanner;

public class Check_Number_EvenOrOdd {

	private static void evenOdd(int n ){
		int bitMask = 1;
		
		// using the '&' with 1 
		if( (n & bitMask) == 0 ){
			System.out.print("Even");
		}
		else {
			System.out.print("Odd");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		
		evenOdd(n);
		
		sc.close();
	}

}
