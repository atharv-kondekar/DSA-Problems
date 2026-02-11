package foundations;
import java.util.Scanner;

public class Count_Set_Bits_In_Number {

	private static int setBitsCount(int num) {
		int count = 0;
		
		while(num>0) {
			num = num & (num-1);
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		System.out.print("The Set Bits in the Number is : "+setBitsCount(num));
		
		sc.close();
	}

}
