package bit_manipulation;
import java.util.Scanner;

public class Clear_ith_bit {

	private static int clear_ith_bit(int n , int  i ) {
		int bitmask = ~( 1 << i); 
		return n & bitmask; // Clear means ,we have to set 0 to the ith bit 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		
		System.out.print("Enter position of bit you want to clear  :  ");
		int i = sc.nextInt();
		
		System.out.print("After clearing "+i+"th bit : "+clear_ith_bit(n,i));
		
		sc.close();
	}

}
