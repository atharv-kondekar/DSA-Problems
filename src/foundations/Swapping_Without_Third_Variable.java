package foundations;

public class Swapping_Without_Third_Variable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10 ;
		int b =5;
		
		System.out.print("Before Swap : a="+a+",b="+b);
		/*Approach 1 */
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("\nAfter Swap : a="+a+",b="+b);
		
		/*Approach 2 : Using the XOR 
		  	
		  	if 2 bits are similar then op:1 else op:0
		  	0 ^ 0 : 1
		  	0 ^ 1 : 0
		  	1 ^ 0 : 0
		  	1 ^ 	1 : 1 
		 */
		
		System.out.print("\n\nBefore Swap : a="+a+",b="+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.print("\nAfter Swap : a="+a+",b="+b);
	}

}
