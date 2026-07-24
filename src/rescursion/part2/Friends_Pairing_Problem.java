package rescursion.part2;

public class Friends_Pairing_Problem {

	private static int friendsPairing(int n)
	{
		if( n == 1 ){
			return 1;
		}
		if(  n == 2 ){
			return 2;
		}

		return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(friendsPairing(3));
		System.out.println(friendsPairing(4));
	}

}
