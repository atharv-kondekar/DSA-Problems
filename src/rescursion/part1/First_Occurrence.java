package rescursion.part1;

public class First_Occurrence {

	private static int firstOccurrence(int arr[] , int  i , int  key ) {
		
		if(i == arr.length ) {
			return -1;
		}
		
		if( arr[i] == key ) {
			return i;
		}
		
		return firstOccurrence(arr,i+1,key);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,32,5,2,4,23,1,4,5,3};
		int key = 5;
		
		if( firstOccurrence(arr,0,key) == -1) {
			System.out.print("Element Not found !!! ");
		}
		else {
			System.out.print("Element found at: "+firstOccurrence(arr,0,key)+" position.");
		}
	}

}
