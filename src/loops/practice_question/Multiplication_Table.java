package loops.practice_question;
import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.print(" "+ n*i );
		}
	}

}
