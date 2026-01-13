package loops.practice_question;
import java.util.Scanner;

public class Sum_Of_Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int number , choice;
		int oddsum=0, evensum=0;
		
		do
		{
			System.out.print("Enter the Number : ");
			number = sc.nextInt();
			
			if (number%2 == 0) {
				evensum+=number;
			}
			else {
				oddsum+=number;
			}
			
			System.out.print("Do you want to continue ? (yes-1/no-0) : ");
			choice=sc.nextInt();
			
		}while(choice==1);
		
		System.out.print("The evensum : "+evensum);
		System.out.print("\nThe odd sum : "+oddsum);
	}

}
