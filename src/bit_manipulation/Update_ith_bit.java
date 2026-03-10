package bit_manipulation;

public class Update_ith_bit {
	
	private static int set_ithBit( int n , int i ) {
		int bitmask = 1<<i;
		return n|bitmask;
	}
	
	private static int clear_ithBit(int n , int i ){
		int bitmask = ~(1<<i);
		return n&bitmask;
	}
	
	private static int update_ithBit(int n , int i , int newBit) {
		if(newBit==0) {
			return clear_ithBit(n,i);
		}
		else {
			return set_ithBit(n,i);
		}
	}
	
	private static int update_ith_bit(int n , int i , int newBit) {
		
		n = clear_ithBit(n,i);
		int bitmask = newBit<<i ;
		return n|bitmask;
	}
	
	public static void main(String []args) {
		
		System.out.print(update_ithBit(10,2,1));
		System.out.print("\n"+update_ith_bit(10,2,1));
	}
}
