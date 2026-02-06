package strings;

public class Largest_String {

	// Time complexity : O(n*x) x:for the Largest string in the Set of String
	private static String largestString(String []fruits) {
		String largest = fruits[0];
		
		for(int i = 1 ; i <fruits.length ; i++ ) 
		{
			// largest.compareToIgnoreCase(fruits[i]) :- in this ( 'A'='a' )
			if( largest.compareTo(fruits[i]) < 0 ) {
				largest = fruits[i];
			}
		}
		return largest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fruits[]= {"apple","mango","banana","greaphs","orange"};
		System.out.print("Lagest String : "+largestString(fruits));
	}

}
