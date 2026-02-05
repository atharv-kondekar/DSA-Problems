package array_2D;

public class Print_Row_In_Matrix {

	private static void printRow(int [][]matrix , int row )
	{
		if(row<0 ||row >= matrix.length )
			System.out.print("Enter the valid Row ");
		
		int i = row;
		for(int j = 0 ; j < matrix[0].length ; j++ )
		{
			System.out.print(matrix[i][j]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {
			    {1,2,3,4},
			    {5,6,7,8},
			    {9,10,11,12},
			    {13,14,15,16}
			};
		
		printRow(matrix,3);
	}

}
