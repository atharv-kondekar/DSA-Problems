package Array.part_1;

public class Pairs_In_Array {

	private static void pairs(int [] arr ) 
	{
		if( arr.length <= 1 || arr==null ) {
			System.out.print("No pairs Possible !! ");
			return ;
		}
		
		System.out.print("Pairs:\n");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1 ;j<arr.length;j++)
			{
				System.out.print("("+arr[i]+","+arr[j]+") ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { };
		pairs(arr);
	}

}
