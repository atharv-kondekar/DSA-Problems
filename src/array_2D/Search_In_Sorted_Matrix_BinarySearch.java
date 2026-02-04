package array_2D;

public class Search_In_Sorted_Matrix_BinarySearch {

	private static int binarySearch(int right[] , int target )
	{
		int start = 0 ; 
		int end = right.length-1;
		
		
		while(start<=end) {
			int mid = (start+end)/2;
			
			if(right[mid] == target )
				return mid;
			else 
			if(right[mid] < target )
				start=mid+1;
			else
				end=mid-1;
		}
		
		return -1;
	}

	// Still Complexity is O(n log n)
	private static boolean searchInMatrix(int matrix[][] , int target )
	{
		for(int i = 0 ; i  <matrix.length ; i++ )
		{
			int j = binarySearch(matrix[i],target);
			
			if( j > -1 ) {
				System.out.print("The Element found at : ("+i+","+j+") cell");
				return true;
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
