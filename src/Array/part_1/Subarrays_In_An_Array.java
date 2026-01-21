package Array.part_1;

public class Subarrays_In_An_Array {
	
	private static void subArrays(int [] arr)
	{
		for(int i=0;i<arr.length ; i++) 
		{	
			for(int j=i ;j<arr.length;j++)
			{
				System.out.print("[ ");
				for(int k = i ; k<=j ; k++ ) 
				{
					System.out.print(arr[k]+" ");
				}
				System.out.print("]");
				
				System.out.print("\n");
			}
			
			System.out.println();
		}	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {2,4,6,8,10};
		subArrays(arr);
	}
}
