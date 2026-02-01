package array_2D;
import java.util.Scanner;
public class Real_Time_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Total Number of Students : ");
		int m = sc.nextInt();
		System.out.print("Enter the Total Number of Subjects : ");
		int n = sc.nextInt();
		
		int marks[][] = new int[m][n];
		for(int i = 0 ; i < marks.length ; i++ )
		{
			System.out.print("Enter Marks for the Student "+(i+1)+" : ");
			for(int j = 0 ; j < marks[0].length ; j++ )
			{
				marks[i][j]=sc.nextInt();
			}
		}
		
		for(int i = 0 ; i < marks.length ; i++ )
		{
			System.out.print("S"+(i+1)+" : ");
			for(int j=0; j < marks[0].length ; j++ )
			{
				System.out.print(marks[i][j]+" ");
			}
			System.out.print("\n");
		}
		
		sc.close();
	}

}
