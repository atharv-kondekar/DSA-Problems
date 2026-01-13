package patterns;

public class Character_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'A';
		int n = 4 ;
		
		for(int i=1 ; i<= n ;i++) 
		{
			for(int j = 1 ; j <= i ; j++ ) 
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}

}
/*
 	A
	BC
	DEF
	GHIJ
*/
