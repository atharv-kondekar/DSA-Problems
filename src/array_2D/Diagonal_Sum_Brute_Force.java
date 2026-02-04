package array_2D;

public class Diagonal_Sum_Brute_Force {

	private static int diagonalSum(int [][]matrix )
	{
		int sum = 0;
		for(int i = 0 ; i <matrix.length ; i++  )
		{
			for(int j=0 ; j < matrix[0].length ; j++ )
			{
				if( i == j )
					sum+=matrix[i][j];
				else if( i+j == matrix.length-1)
					sum+=matrix[i][j];
				//else
					//continue;
			}
		}
		
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {
			    {1,2,3,4},
			    {5,6,7,8},
			    {9,10,11,12},
			    {13,14,15,16}
			};
		
		int [][]arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		System.out.print("The Sum of the Diagonal elements : "+diagonalSum(matrix));
		System.out.print("\nThe Sum of the Diagonal elements : "+diagonalSum(arr));
	}

}
