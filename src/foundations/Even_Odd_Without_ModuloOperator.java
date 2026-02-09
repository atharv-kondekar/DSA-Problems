package foundations;
import java.util.Scanner;

public class Even_Odd_Without_ModuloOperator {

	private static void evenOdd(int num ) {
		
		if( (num/2)*2 == num) {
			System.out.print("Even Number");
		}
		else {
			System.out.print("Odd Number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		
		evenOdd(num);
	}

}
