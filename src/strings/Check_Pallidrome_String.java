package strings;
import java.util.Scanner;

public class Check_Pallidrome_String {

	private static boolean pallidromeString(String str) {
		
		int n = str.length();
		for(int i = 0 ; i < n ; i++ ) 
		{
			if( str.charAt(i) != str.charAt(n-i-1) )
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		
		if(pallidromeString(str)) {
			System.out.print("The String is Pallidrome ");
		}
		
		else {
			System.out.print("The String is Not Pallidrome");
		}
		
		sc.close();
	}

}
