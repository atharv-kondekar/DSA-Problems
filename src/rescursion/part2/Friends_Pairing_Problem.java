package rescursion.part2;

public class Friends_Pairing_Problem {

	private static int friendsPairing(int n)
	{
		if( n == 1 || n==2) {
			return n;
		}
		
		int fnm1 = friendsPairing(n-1);
		
		int fnm2 = friendsPairing(n-2);
		int pairs = (n-1)*fnm2;
		
		int totalWays = fnm1 + pairs;
		
		return totalWays;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(friendsPairing(3));
	}

}
