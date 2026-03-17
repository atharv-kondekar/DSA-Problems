package rescursion.part1;

public class Sum_of_n_naturalNumbers {

	private static int sumOfN_Numbers(int n ) {
		if(n==1) {
			return 1;
		}
		
		return n+sumOfN_Numbers(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5 ;
		System.out.print("Sum : "+sumOfN_Numbers(n));
	}

}
