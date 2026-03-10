package bit_manipulation;

public class Clear_last_iBits {

	private static int clearLast_i_Bits(int n , int i ) {
	  //int bitmask = -1<<i;  // we can take it also 
		int bitmask = ~(0)<<i;
		return n & bitmask;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print( clearLast_i_Bits(15,2));
	}

}
