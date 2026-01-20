package Array.part_1;
import java.util.*;

public class Largest_Smallest_Number {
	
	private static int largestNumber(int number[]){
		
		int largest = Integer.MIN_VALUE; // this is "-infinity"
		
		for(int i=0;i<number.length ; i++) 
		{
			if( largest < number[i])
				largest = number[i];
		}
		
		return largest;
	}
	
	private static int smallestNumber(int number[]) {
		
		int smallest = Integer.MAX_VALUE; // This is "+infinity"
		
		for(int i=0;i<number.length;i++)
		{
			if( smallest > number[i])
				smallest = number[i];
		}
		
		return smallest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {10,23,35,32,55};
		System.out.print("Smallest Number : "+smallestNumber(arr));
		System.out.print("\nLargest Number : "+largestNumber(arr));
	}

}
