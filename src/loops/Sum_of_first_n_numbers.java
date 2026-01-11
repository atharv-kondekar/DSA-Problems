package loops;
import java.util.Scanner;

public class Sum_of_first_n_numbers {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i =1 ;
		
		while(i<=n)
		{
			sum += i;
			i++;
		}
		System.out.print("The Sum of first "+n+" natural number is  : "+sum);
	}
}
