package Array.part_2;

public class Trapped_Rainwater_Problem {

	private static int  trappedRianWater(int [] height ) {
		
		int n = height.length;
		if( n < 3 ) return 0;
		
		int [] left_max = new int[n];
		int [] right_max = new int[n];
		
		// left_max Auxiliary Array 
		left_max[0]=height[0];
		for(int i = 1 ; i<n ; i++)
		{
			left_max[i] = Math.max(left_max[i-1], height[i]);
		}
		
		// right_max Auxiliary Array 
		right_max[n-1]=height[n-1];
		
		for(int i = n-2 ; i>=0 ;i--)
		{
			right_max[i] = Math.max(right_max[i+1], height[i]);
		}
		

		 int trapped_water = 0;
		    for (int i = 0; i < height.length; i++) {
		        trapped_water += Math.min(left_max[i], right_max[i]) - height[i];
		    }
		
		return trapped_water;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,2,0,6,3,2,5};
		int n = trappedRianWater(arr);
		System.out.print(n);
	}

}
