package Array.part_1;

public class Array_As_Argument {

	private static void update(int []arr ,int a )
	{
		a++;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6};
		int a = 5;
		
		System.out.print("Before Update : \n");
		
		System.out.print(" a : "+a);
		System.out.print("\n");
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
		
		update(arr,a);
		System.out.print("\nAfter Update : \n");
		
		System.out.print(" a : "+a);
		System.out.print("\n");
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
		
		//Array is the "call by reference"
	}

}
