package loops;
import java.util.Scanner;

public class Check_Pallidrome_Number {
	private static boolean pallidrome(int n) {
		
		if( n == reverse(n)) {
			return true;
		}
		else
			return false;
	}
	
	private static int reverse(int n) {
		int reverse = 0;
		
		while(n>0) {
			int last_digit = n % 10;
			reverse = (reverse*10)+last_digit;
			n=n/10;
		}
		
		return reverse;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");;
		int n =  sc.nextInt();
		
		if(pallidrome(n)) {
			System.out.print("The Number is Pallidrome ✅");
		}
		else {
			System.out.print("The Number is Not Pallidrome !!");
		}
	}

}
