package rescursion.part1;

public class Print_Numbers_in_Increasing_Order {

	private static void printIncreasing(int n ) {
		if(n==0) { //Base Case 
			return ; 
		}
		
		printIncreasing(n-1);
		System.out.print(" "+n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		printIncreasing(n);
	}

}
