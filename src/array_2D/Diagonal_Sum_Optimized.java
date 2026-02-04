package array_2D;

public class Diagonal_Sum_Optimized {

	private static int diagonalSum(int [][] matrix) // O(n)
	{
		int sum = 0;
		
		for(int i = 0 ; i < matrix.length ; i++ )
		{
			//Primary Diagonal 
			sum+= matrix[i][i]; // i==j
			
			//Secondary Diagonal
			if( i != matrix.length-1-i ) // i != j
				sum+=matrix[i][matrix.length-1-i]; 
			/*
				i+j == matrix.length-1 
				j= matrix.length-1-i
			*/
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
