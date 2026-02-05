package array_2D;

public class Count_Number_In_2DArray {

	private static int countNumber(int [][] matrix,int number) {
		
		int count = 0;
		
		for(int i = 0 ; i < matrix.length ; i++ )
		{
			for(int j = 0 ; j < matrix[0].length ; j++ ) {
				if(matrix[i][j] == number )
					count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
			    {1,2,3,7},
			    {3,6,7,7},
			    {9,10,56,12},
			    {13,14,6,16}
			};
		
		System.out.print("The Count of Specific number in Matrix : "+countNumber(matrix,7));
	}

}
