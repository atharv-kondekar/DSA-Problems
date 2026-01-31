package array_2D;
import java.util.Scanner;
public class Representation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[3][3];
		
		for(int i = 0 ; i < arr.length ; i++ )
		{
			for(int j = 0 ; j < arr[0].length ; j++ )
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++ )
		{
			for(int j = 0 ; j < arr[0].length ; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
		
	}

}
