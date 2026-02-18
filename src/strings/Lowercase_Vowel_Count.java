package strings;

import java.util.Scanner;

// How many time the LowerCase vowel occurred in string entered by user
public class Lowercase_Vowel_Count {

	private static int countLowercaseVowel(String str )
	{
		int count = 0 ;
		for(int i = 0 ; i < str.length() ; i++ )
		{
			char ch = str.charAt(i);
			
			if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		
		System.out.print("The Count of Vowels in the String is : "+countLowercaseVowel(str));
		
		sc.close();
	}

}
