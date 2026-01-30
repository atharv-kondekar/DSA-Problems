package sorting_algoithms;
import java.util.Scanner;
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
	
	private static void insertionSort(int arr [])
	{
		int n = arr.length;
		
		for(int i = 1 ; i < n-1 ; i++ )
		{
			int current = arr[i];
			int prev = i-1;
			
			//Finding the right position
			while( prev >=0 && current > arr[prev])
			{
				arr[prev+1]=arr[prev];
				prev--;
			}
			
			//insertion at right position
			arr[prev+1] = current;
		}
		
		printArr(arr);
	}
	
	private static void countingSort(int arr[])
	{
		int largest = Integer.MIN_VALUE;
		for(int i=0;i<arr.length ; i++) {
			largest=Math.max(largest, arr[i]);
		}
		
		int count[] = new int[largest+1];
		for(int i=0;i<arr.length;i++)
		{
			count[arr[i]]++;
		}
		
		int j=0;
		// Traversing the Count[] in the Reverse order
		for(int i=count.length-1 ; i>=0 ; i--)
		{
			while(count[i]>0)
			{
				arr[j]=i;
				j++;
				count[i]--;
			}
		}
		
		printArr(arr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {3,6,2,1,8,7,4,5,3,1};
		//bubbleSortOptimized(arr);
		//selectionSort(arr);
		//insertionSort(arr);
		//countingSort(arr);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose the Sorting technique in Descending order : ");
		System.out.print("\n1.Bubble Sort\n2.Selection Sort\n3.Insertion Sort\n4.Counting Sort");
		
		int choice;
		System.out.print("\n-------Enter Choice : ");
		choice = sc.nextInt();
		
		switch(choice){
			case 1:{
				bubbleSortOptimized(arr);
				break;
			}
			
			case 2:{
				selectionSort(arr);
				break;
			}
			
			case 3:{
				insertionSort(arr);
				break;
			}
			
			case 4:
			{
				countingSort(arr);
				break;
			}
			
			default:{
				System.out.print("Invalid Choice!!!");
			}
		}
		
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
