package array_2D;

public class Transpose_Of_Matrix {

	private static void transpose(int matrix[][] )
	{
		int row = matrix.length;
		int col = matrix[0].length;
		
		int transpose[][] = new int[col][row];
		
		for(int i = 0 ; i < row ; i++ )
		{
			for(int j= 0 ; j < col ; j++ )
			{
				transpose[j][i] = matrix[i][j];
			}
		}
		
		printMatrix(transpose);
	}
	private static void printMatrix(int[][] matrix) {
		for(int i = 0 ; i <matrix.length ; i++ ) {
			for(int  j = 0 ; j < matrix[0].length ; j++ )
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
			    {1,2,3},
			    {5,6,7},
			    {9,10,11},
			    {13,14,15}
			};
		printMatrix(matrix);
		System.out.print("\nTranpose:\n");
		transpose(matrix);
	}

}
