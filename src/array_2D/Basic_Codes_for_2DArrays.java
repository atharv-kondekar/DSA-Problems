package array_2D;
import java.util.Scanner;

public class Basic_Codes_for_2DArrays {


	private static void search(int arr[][] , int target )
	{
		for(int i = 0 ; i < arr.length ; i++ )
		{
			for(int j=0 ; j < arr[0].length ; j++ )
			{
				if( arr[i][j] == target )
				{
					System.out.print("The Element "+target+" Found at cell ("+i+","+j+")");
					return ;
				}
			}
		}
		
		System.out.print("The Element "+target+" Not Found !!!");
	}
	
	private static int largest(int arr[][]){
		int largest = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < arr.length ; i++ ) {
			for(int j = 0 ; j < arr[0].length ;j++ ) {
				largest = Math.max(largest,arr[i][j]);
			}
		}
		
		return largest;
	}
	
	private static int smallest(int arr[][]){
		int smallest = Integer.MAX_VALUE;
		for(int i = 0 ; i < arr.length ; i++ ){
			for(int j = 0 ; j <arr[0].length ; j++){
				smallest = Math.min(smallest, arr[i][j]);
			}
		}
		
		return smallest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[3][3];
		
		for(int i = 0 ; i < arr.length ; i++ ){
			for(int j = 0 ; j < arr[0].length ; j++ ){
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++ ){
			for(int j = 0 ; j < arr[0].length ; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
		
		search(arr,3);
		System.out.print("\nThe Largest Element : "+largest(arr));
		System.out.print("\nThe Smallest Element : "+smallest(arr));
		
		sc.close();
	}

}
