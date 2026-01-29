package sorting_algoithms;

public class Insertion_Sort {

	private static void printArr(int arr[])
	{
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	private static void insertionSort(int [] arr )
	{
		int n = arr.length;
		
		for(int i = 1; i < n; i++ )
		{
			int current = arr[i];
			int prev = i-1;
			
			// Finding the Correct Position for the Insertion
			while( prev >= 0 && arr[prev]>current )
			{
				arr[prev+1]=arr[prev];
				prev--;
			}
			// Insertion
			arr[prev+1]=current;
		}
		
		printArr(arr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {32,32,4,2,2,34,23,234,1,5,3};
		insertionSort(arr);
	}

}
