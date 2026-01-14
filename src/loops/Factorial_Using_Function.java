package loops;
import java.util.Scanner;

public class Factorial_Using_Function {

	static private int fact(int n )
	{
		int f = 1;
		
		for(int i=n ;i >=1 ;i--)
		{
			f=f*i;
		}
		
		return f;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int n=sc.nextInt();
		
		System.out.print("The factorial of the "+n+" is : " + fact(n));
	}

}
