package bit_manipulation;
import java.util.Scanner;

public class Get_ith_bit {

	private static int get_ith_bit(int n , int i ) {	
		int bitmask = 1<<i; 
		
		if( (n & bitmask) == 0 ) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		
		System.out.print("Enter position of bit you want :  ");
		int i = sc.nextInt();
		
		System.out.print("The "+i+"th bit in the "+n+" number is : "+get_ith_bit(n,i));
		
		sc.close();
	}

}
