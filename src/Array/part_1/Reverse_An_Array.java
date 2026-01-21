package Array.part_1;

public class Reverse_An_Array {

	private static void reverseAnArray(int []arr) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			// swap(arr[i],arr[j]); // The Primitive Data types can't be used as "Call by Reference"
			swap(arr,start,end);
			start++;
			end--;
		}
	}
	
	private static void swap(int arr[],int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]=temp;
	}
	
/*   Primitive Data-types(a,b) can't be used as the "Call By reference"
 * 
	private static void swap(int a ,int b )
	{
		int temp  = a ;
		a=b;
		b=temp;
	}
*/
	private static void printArray(int [] arr)
	{
		for(int i = 0 ;i< arr.length ; i++ )
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,20,30,40,50,60};
		System.out.print("Before Reverse : \n");
		printArray(arr);
		
		System.out.print("\nAfter the Reverse : \n");
		reverseAnArray(arr);
		printArray(arr);
		
	}

}
