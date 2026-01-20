package Array.part_1;

public class Binary_Search {

	private static int binarySearch(int arr[] , int key ) {
		int start=0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = (start+end)/2;
			
			if(arr[mid] == key )
				return mid;
			if(arr[mid] < key)
				start=mid+1;
			else
				end=mid-1;
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};
		int key = 40;
		
		int index= binarySearch(arr,key);
		
		if(index!= -1)
			System.out.print("The Element found at "+index+" position in array ");
		else
			System.out.print("The element is not found ");
	}

}
