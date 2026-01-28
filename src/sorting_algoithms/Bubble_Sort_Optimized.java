package sorting_algoithms;

public class Bubble_Sort_Optimized {
	
	private static void swap(int arr[] , int i , int j)
	{
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	private static void bubbleSort(int [] arr )
	{
;		int n = arr.length;
		boolean swapped ;
		
		for(int i = 0 ; i < n-1 ;i++)
		{
			swapped = false;
			
			for(int j = 0 ; j < n-1-i ; j++ )
			{
				if(arr[j] > arr[j+1])
				{
					swap(arr,j,j+1);
					swapped = true;
				}
			}
			
			if(!swapped)
			{
				System.out.print("The Array is Already Sorted\n");
				break;
			}
		}
		
		printArr(arr);
	}
	
	private static void printArr(int arr[])
	{
		for(int i = 0 ; i< arr.length ; i++ )
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1,2,3,4,5};
		bubbleSort(arr);
	}

}
