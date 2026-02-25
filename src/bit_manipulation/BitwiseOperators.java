package bit_manipulation;

public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// All Bitwise Operators 
		
		//Bitwise AND operator (&)
		System.out.print(5 & 6);
		
		// Bitwise OR operator(|)
		System.out.print("\n"+ (5|6) );
		
		// Bitwise XOR operator(^)
		System.out.print("\n"+ (5^6));
		
		//Bitwise ones complement 
		System.out.print("\n"+ ~5); // Applies 1's Complement then 2's Complement then uses MSB of the 1's Complement
		System.out.print("\n"+ ~0);
	
		// Bitwise Left Shift (<<)       
		System.out.print("\n"+ (5<<2)); // (a<<b = a * 2 RaiseTo b)
		
		// Bitwise Right Shift (>>)
		System.out.print("\n"+ (5>>2)); // (a>>b = a/2 RaiseTo b )
	}

}
