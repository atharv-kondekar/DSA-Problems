package loops;
import java.util.Scanner;

public class Decimal_To_Binary {

	private static int decimalToBinary(int n) {
		int binaryNum = 0;
		int pow = 0;
		
		while(n>0) {
			int bit = n % 2;
			binaryNum = (int) (binaryNum + ( bit * Math.pow(10,pow)));
			n = n / 2;
			pow++;
		}
		
		return binaryNum;
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("\nEnter the Number : ");
		n = sc.nextInt();
		
		System.out.print("The Binary Conversion of "+n+" is : "+ decimalToBinary(n));
		
	}

}
