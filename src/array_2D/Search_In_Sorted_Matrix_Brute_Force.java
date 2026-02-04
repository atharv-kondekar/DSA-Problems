package array_2D;

public class Search_In_Sorted_Matrix_Brute_Force {

	// Worst : o(n^2);
	private static boolean searchInMatrix(int [][] matrix ,int target) {
		
		for(int i = 0 ; i  <matrix.length  ; i++ )
		{
			for(int j = 0 ; j < matrix[0].length ; j++ )
			{
				if(matrix[i][j] == target ) {
					System.out.print("The Element found at : ("+i+","+j+") cell");
					return true;
				}
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
			    {1,2,3,4},
			    {5,6,7,8},
			    {9,10,11,12},
			    {13,14,15,16}
			};
		
		if(!searchInMatrix(matrix,11)){
			System.out.print("Element not Found ");
		}
		
	}

}
