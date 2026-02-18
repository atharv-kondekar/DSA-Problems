package strings;
import java.util.Scanner;

public class String_Compression {

	private static String stringCompression(String str)
	{
		StringBuilder sb = new StringBuilder("");
		for(int i = 0 ; i < str.length() ; i++ )
		{
			int  count = 1 ;
			
			while( i < str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
				count++;
				i++;
			}
			
			sb.append(str.charAt(i));
			
			if(count>1){
				sb.append(count);
			}
		}
		
		return  sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		
		System.out.print("Compressed String : "+stringCompression(str));
		
		sc.close();
	}

}
