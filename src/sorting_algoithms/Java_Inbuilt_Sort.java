package sorting_algoithms;

import java.util.Arrays;
import java.util.Collections;

public class Java_Inbuilt_Sort {
	private static void printArr(int arr[])
	{
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
	}
	
	private static void printArr(Integer arr[])
	{
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {5,4,3,1,2};
		
		Arrays.sort(arr1);
		printArr(arr1);
		
		int arr2[] = {5,4,3,1,2};
		Arrays.sort(arr2,0,3);
		printArr(arr2);
		
		int arr3[] = {5,4,3,1,2};
		// Arrays.sort(arr3,Collections.reverseOrder()); Not Works for the "Primitive Data types"
		
		Integer arr4[] = {5,4,3,1,2};
		Arrays.sort(arr4,Collections.reverseOrder());
		printArr(arr4);
		
		Integer arr5[] = {5,4,3,1,2};
		Arrays.sort(arr5,0,3,Collections.reverseOrder());
		printArr(arr5);

	}

}
