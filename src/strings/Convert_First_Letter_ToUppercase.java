package strings;
import java.util.Scanner;

public class Convert_First_Letter_ToUppercase {

	private static String uppercaseString(String str) {
		
		StringBuilder sb = new StringBuilder("");
		char ch = str.charAt(0);
		sb.append(Character.toUpperCase(ch));
		
		for(int i =1 ; i< str.length() ; i++ ) 
		{
			if(str.charAt(i)==' ' && i < str.length()-1) 
			{
				char c = str.charAt(i);
				sb.append(c);
				i++;
				sb.append(Character.toUpperCase(str.charAt(i)));
			}
			
			else{
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = new String();
		System.out.print("Enter the String : ");
		str=sc.nextLine();
		
		System.out.print("\n"+uppercaseString(str));
		
		sc.close();
	}

}
