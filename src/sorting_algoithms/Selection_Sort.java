package sorting_algoithms;

public class Selection_Sort {

	/*
	  The Smallest Value Amoung the Unsorted array is placed at beginning of an array 
	*/
	private static void selectionSort(int [] arr)
	{
		int n = arr.length;
		
		for(int i=0; i< n-1 ; i++ )
		{
			int min = i ;
			//We find here the Smallest Element Index from following loop 
			for(int j=i+1 ; j<n;j++)
			{
			  //if(arr[min]<arr[j]) : For the Decreasing Order 
				if(arr[min]>arr[j])
					min=j;
			}
			if(min != i)
				swap(arr,i,min);
		}
		printArr(arr);
	}
	
	private static void swap(int arr[],int i , int  j)
	{
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	private static void printArr(int arr[])
	{
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {99,123,32,345,667,3,1};
		selectionSort(arr);
	}

}
