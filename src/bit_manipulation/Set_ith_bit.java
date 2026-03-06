package bit_manipulation;
import java.util.Scanner;

public class Set_ith_bit {

	private static int set_ith_bit(int n , int  i ) {
		int bitmask = 1<<i; 
		return n | bitmask;  // Set -> means we have to convert the ith bit into 1 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		
		System.out.print("Enter position of bit you want to set  :  ");
		int i = sc.nextInt();
		
		System.out.print("After setting "+i+"th bit : "+set_ith_bit(n,i));
		
		sc.close();
		
	}

}
