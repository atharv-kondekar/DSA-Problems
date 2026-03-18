package rescursion.part1;

public class Check_Array_IsSorted {

	private static boolean isSorted(int arr[] , int i ) {
		
		if( i == arr.length-1 ) {
			return true;
		}
		
		if( arr[i] > arr[i+1]) {
			return false;
		}
		
		return isSorted(arr,i+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1 [] = {1,2,3,5,4};
		System.out.print("The Array is Sorted ? : "+isSorted(arr1,0));
		
		int arr2 [] = {10,20,30,40};
		System.out.print("\nThe Array is Sorted ? : "+isSorted(arr2,0));
	}

}
