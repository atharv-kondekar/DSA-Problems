package strings;

public class StringBuilder_Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 ="";
		for(char ch = 'a' ; ch <= 'z' ; ch++ ) {
			str1+=ch;
		}
		System.out.print(str1);
		
		
		String str2 = new String();
		for(char ch = 'a' ; ch <= 'z' ; ch++ ) {
			str2+=ch;
		}
		System.out.print("\n"+str2);
		
		/*
			Code 1 & 2 : "" → "a" → "ab" → "abc" → ... → "abcdefghijklmnopqrstuvwxyz"
		*/
		
		StringBuilder sb = new StringBuilder();
		for(char ch = 'a' ; ch <= 'z' ; ch++ ) {
			sb.append(ch);
		}
		System.out.print("\n"+sb);
	}
/*	
	| Code               | Object Type   | Mutability  | Time Complexity | Verdict |
	| ------------------ | ------------- | ----------- | --------------- | ------- |
	|  String str1 = ""  | String        | ❌ Immutable | **O(n²)**       | Bad     |
	|  new String()      | String        | ❌ Immutable | **O(n²)**       | Worse   |
	|  StringBuilder     | StringBuilder | ✅ Mutable   | **O(n)**        | Best    |
*/
}
