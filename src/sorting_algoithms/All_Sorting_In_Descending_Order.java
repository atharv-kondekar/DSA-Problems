package sorting_algoithms;

public class All_Sorting_In_Descending_Order {
	
	private static void bubbleSortOptimized(int []arr)
	{
		int n = arr.length;
		boolean swapped = false;
		
		for(int i = 0 ; i < n -1 ; i++ )
		{
			swapped = false;
			for(int  j = 0 ; j  < n-1-i ; j++ ) 
			{
				if( arr[j] < arr[j+1])	{
					swap(arr,j,j+1);
					swapped = true;
				}
				
			}
			
			if(!swapped) {
				break;
			}
		}
		
		printArr(arr);
	}
	
	private static void selectionSort(int arr[])
	{
		int n = arr.length;
		
		for(int i = 0 ; i  < n-1 ; i++) {
			int min = i ;
			for(int j = i+1 ; j < n ; j++ )
			{
				if(arr[min] < arr[j])
				{
					min = j;
				}
			}
			
			if(min!=i)
				swap(arr,i,min);
		}
		
		printArr(arr);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {3,6,2,1,8,7,4,5,3,1};
		//bubbleSortOptimized(arr);
		selectionSort(arr);
		
	}
	
	private static void swap(int arr[] , int i , int j)
	{
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	private static void printArr(int arr[])
	{
		for(int i = 0 ; i< arr.length ; i++ )
		{
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
	}
}
