package loops;
import java.util.Scanner;

public class Sum_Of_Digits_In_Number {

	private static int sumOfDigits(int number) {
		int sum = 0 ;
		
		while(number>0) {
			int last_digit = number%10;
			sum=sum+last_digit;
			number=number/10;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		System.out.print("The Sum of digits in the Number is : "+ sumOfDigits(n));
	}

}
