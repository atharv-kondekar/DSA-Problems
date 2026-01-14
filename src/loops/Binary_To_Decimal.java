package loops;
import java.util.Scanner;

public class Binary_To_Decimal {

	private static int binaryToDecimal(int binaryNum) {
		int dec = 0;
		int power = 0;
		
		while(binaryNum>0) {
			int last_digit = binaryNum%10 ; // For taking "last digit" of any num -> use n%10
			dec= (int) ( dec + (last_digit * Math.pow(2,power)));
			binaryNum= binaryNum/10;// For removing the last digit of the any number ->use n=n/10
			power++; 
		}
		
		return dec;
	}
	
	private static boolean checkBinary(int num) {
		boolean binary = true; 
		
		while(num>0) {
			int last_digit=num%10;
			
			if(last_digit != 0 && last_digit!=1) {
				binary = false;
				break;
			}
			num=num/10;
		}
		
		return binary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Binary Number : ");
		int num = sc.nextInt();
		
		if( checkBinary(num)) {
			System.out.print("The Decimal Conversion : "+ binaryToDecimal(num));
		}
		else {
			System.out.print("Enter the valid binary Number !!!!");
		}
	
	}

}
