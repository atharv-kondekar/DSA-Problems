package rescursion.part1;

public class Last_Occurrence {

	// The First one is BETTER : Because it stops Early , Less calls
	private static int lastOccurrence(int arr[] , int key , int i )
	{
		if( i < 0 ) {
			return -1;
		}
		
		if( arr[i] == key ) {
			return i;
		}
		
		return lastOccurrence(arr,key,i-1);
	}
	
	private static int lastOccurr(int arr[] , int key , int i ) {
		if( i == arr.length ) {
			return -1;
		}
		
		int isFound = lastOccurr(arr,key,i+1);
		
		if( isFound == -1 && arr[i] == key ) {
			return i;
		}
		
		return isFound;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,3,5,2,10,5,6,5,6,7,8,9,3};
		int key = 5;
		
		if( lastOccurrence(arr,key,arr.length-1) == -1) {
			System.out.print("Element Not found !!! ");
		}
		else {
			System.out.print("Element found at: "+lastOccurrence(arr,key,arr.length-1)+" position.");
		}
		
		int arr1[] = {2,3,5,2,10,5,6,5,6,7,8,9,3};
		
		if( lastOccurr(arr,key,0) == -1) {
			System.out.print("\nElement Not found !!! ");
		}
		else {
			System.out.print("\nElement found at: "+lastOccurr(arr,key,0)+" position.");
		}
	}

}
