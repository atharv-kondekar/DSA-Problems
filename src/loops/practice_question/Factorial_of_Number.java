package loops.practice_question;
import java.util.Scanner;

public class Factorial_of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		int fact = 1;
		
		for(int i = n ; i >= 1 ; i-- ) {
			fact=fact*i;
		}
		
		System.out.print("\nThe Factorial of the "+n+" is : "+fact);
	}

}
