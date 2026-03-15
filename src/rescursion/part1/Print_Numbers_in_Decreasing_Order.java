package rescursion.part1;

public class Print_Numbers_in_Decreasing_Order {
	
	private static void printInDecreasingOrder(int n ) {
		if( n ==0 ) {
			return ;
		}
		
		System.out.print(" "+n);
		printInDecreasingOrder(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		printInDecreasingOrder(n);
	}

}
