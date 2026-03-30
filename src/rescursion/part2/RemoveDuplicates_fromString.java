package rescursion.part2;
import java.util.Scanner;

public class RemoveDuplicates_fromString {

	private static void removeDuplicates(String str , int idx , StringBuilder newStr , boolean map[]) {
		
		if(idx == str.length()) {
			System.out.print("After Removing Duplicates : "+newStr);
			return ;
		}
		
		char currChar = str.charAt(idx);
		
		if( map[currChar - 'a'] == true ) { // Check if the Character is appears second time 
			removeDuplicates(str,idx+1,newStr,map);
		}
		else { //else appears first time 
			map[currChar-'a']=true;
			
			newStr.append(currChar);
			removeDuplicates(str,idx+1,newStr,map);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String : ");
		String str = sc.next();
		
		removeDuplicates(str,0, new StringBuilder("") , new boolean[26]);
		
		sc.close();
	}
	

}
