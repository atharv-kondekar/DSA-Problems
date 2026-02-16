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
		
		System.out.print(""+uppercaseString(str));
		System.out.print("\n"+expandedCode(str));
		sc.close();
	}
	
	private static String expandedCode(String str) {
		
		StringBuilder sb = new StringBuilder("");
		
		char ch1 = str.charAt(0);
		char ch2 = Character.toUpperCase(ch1);
		sb.append(ch2);
		
		for(int i = 1 ; i < str.length() ; i++ ) 
		{
			if( str.charAt(i) == ' ' && i < str.length()-1 )
			{
				char ch3 = str.charAt(i);
				sb.append(ch3);
				
				i++;
				
				char ch4 = str.charAt(i);
				char ch5 = Character.toUpperCase(ch4);
				sb.append(ch5);
			}
			else
			{
				char ch6 = str.charAt(i);
				sb.append(ch6);
			}
		}
		
		return sb.toString();
	}

}
