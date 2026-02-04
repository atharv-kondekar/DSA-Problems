package array_2D;

public class Search_In_Sorted_Matrix_Optimized {

	
	private static boolean staircaseSearch(int matrix[][] , int key )
	{
		// Using (0,m-1)
		int row = 0;
		int col = matrix[0].length-1;
		
		while(row < matrix.length  && col >=0 )
		{
			if( matrix[row][col] == key ) {
				System.out.print("The Element Found at Cell ("+row+","+col+")\n");
				return true;
			}
			// Move Left
			else
			if( key < matrix[row][col] ) {
				col--;
			}
			
			//Move bottom
			else {
				row++;
			}
		}
		
		return false;
	}
	
	private static boolean staircaseSearch(int key,int matrix[][])
	{
		//USING (n-1,0)
		int row=matrix.length-1;
		int col = 0;
		
		while(row>=0 && col<matrix[0].length)
		{
			if( matrix[row][col] == key ) {
				System.out.print("The Element Found at Cell ("+row+","+col+")");
				return true;
			}
			//Move Up
			else
			if( key < matrix[row][col]) {
				row--;
			}
			//Move Right
			else {
				col++;
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
		
		if(!staircaseSearch(matrix,14)){
			System.out.print("Element not Found ");
		}
		if(!staircaseSearch(2,matrix)){
			System.out.print("Element not Found ");
		}
	}

}
