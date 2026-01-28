package sorting_algoithms;

public class Bubble_Sort {

	private static void swap(int arr[] , int a , int  b )
	{
		int temp = arr[a] ;
		arr[a] = arr[b];
		arr[b]= temp;
	}
	
	private static void bubbleSort(int [] arr )
	{
		int n = arr.length;
		
		for(int i = 0 ; i <= n-2 ; i++ ) 
		{
			for(int j = 0 ; j <= n-2-i ; j++)
			{
				if(arr[j]>arr[j+1])
				{
					swap(arr,j,j+1);
				}
			}
		}
		
		printArr(arr,n);
	}
	
	private static void printArr(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {5,4,1,2,3};
		bubbleSort(arr);
	}	

}
