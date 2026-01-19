package patterns_Advanced;
import java.util.Scanner;

public class All_Patterns {
	
	private static void starPattern(int rows)
	{
		for(int i = 1 ; i <= rows ; i++ )
		{
			for(int j=1 ; j<= i ;j++ )
				System.out.print("*");
			System.out.println();
		}
	}
	
	private static void invertedStarPattern(int rows)
	{
		for(int i=1; i<= rows ; i++)
		{
			for(int j=1 ; j<= (rows-i)+1 ; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	private static void halfPyramidNumbers(int rows) {
		for(int i=1 ;i<=rows ;i++ )
		{
			for(int j=1 ; j<= i ;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	private static void characterPattern(int rows) {
		char ch ='A';
		
		for(int i=1 ;i<= rows ;i++) {
			
			for(int j=1 ;j<=i ;j++)	{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
	
	private static void hollowRectanglePattern(int rows , int cols){
		
		for(int i =1 ;i <= rows ; i++ ) {
			for(int j=1 ;j<=cols ; j++) {
				
				if( i==1 || i==rows || j==1 || j==cols)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	private static void invertedRoatedHalfPyramid(int rows){
		for(int i=1 ; i<=rows ; i++) {
			for(int j=1 ; j<= rows-i ;j++)
				System.out.print(" ");
			for(int j=1;j<=i ;j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	private static void invertedHalfPyramidNumbers(int rows) {
		for(int i=1 ; i<= rows ;i++ ) {
			for(int j=1 ; j<= (rows-i)+1 ; j++ )
				System.out.print(j);
			System.out.println();
		}
	}
	
	private static void floydsTriangle(int rows) {
		int number =0;
		
		for(int i=1 ;i<=rows ;i++) {
			for(int j=1 ;j<=i ;j++)
				System.out.print(number++);
			System.out.println();
		}
	}
	private static void triangle_01(int rows) {
		for(int i=1;i<=rows;i++) {
			
			for(int j=1;j<=i;j++) {
				if( (i+j) % 2 == 0)
					System.out.print(1);
				else
					System.out.print(0);
			}
			System.out.println();
		}
	}
	
	private static void butterflyPattern(int rows) {
		for(int i=1 ;i <=rows ; i++) {
			for(int j=1;j<=i;j++)
				System.out.print("*");
			
			for(int j=1;j<=2*(rows-i) ; j++ )
				System.out.print(" ");
			
			for(int j=1;j<=i;j++)
				System.out.print("*");
			
			System.out.println();
		}
		for(int i=rows ;i >=1 ; i--) {
			for(int j=1;j<=i;j++)
				System.out.print("*");
			for(int j=1;j<= 2*(rows-i) ; j++ )
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	private static void solidRhombus(int rows) {
		for(int i=1;i<=rows ; i++)
		{
			for(int j=1;j<=rows-i ;j++)
				System.out.print(" ");
			
			for(int j=1;j<=rows;j++)
				System.out.print("*");
			
			System.out.println();
		}
	}
	
	private static void hollowRhombus(int rows) {
		for(int i=1 ;i<=rows ;i++ )
		{
			for(int j=1;j<=rows-i ;j++)
				System.out.print(" ");
			
			for(int j=1;j<=rows;j++) 
			{
				if( i==1 || i== rows || j==1 || j==rows )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
	}
	
	private static void diamondPattern(int rows) {
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++)
				System.out.print(" ");
			
			for(int j=1;j<= (2*i)-1 ; j++)
				System.out.print("*");
			
			System.out.println();
		}
		
		for(int i=rows;i>=1;i--) {
			for(int j=1;j<=rows-i;j++)
				System.out.print(" ");
			
			for(int j=1;j<= (2*i)-1 ; j++)
				System.out.print("*");
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Rows : ");
		int rows = sc.nextInt();
		
		// 1
		System.out.print("\nStar Pattern : \n");
		starPattern(rows);
		System.out.print("\n-----------------------------------------------------");
		
		//2
		System.out.print("\nInverted Star Pattern : \n");
		invertedStarPattern(rows);
		System.out.print("\n-----------------------------------------------------");
		
		//3
		System.out.print("\nHalf Pyramid Numbers  : \n");
		halfPyramidNumbers(rows);
		System.out.print("\n-----------------------------------------------------");
		
		//4
		System.out.print("\nCharacter Pattern : \n");
		characterPattern(rows);
		System.out.print("\n-----------------------------------------------------");
		
		// 1-4 Basics 
		
		//5
		System.out.print("\nHollow Rectangle pattern  : \n");
		System.out.print(" Enter the Columns for the Hollow Rectangle pattern : ");
		int cols = sc.nextInt();
		hollowRectanglePattern(rows,cols);
		System.out.print("\n-----------------------------------------------------");
		
		//6
		System.out.print("\nInverted & Roated Half Pyramid : \n");
		invertedRoatedHalfPyramid(rows);
		System.out.print("\n-----------------------------------------------------");
		
		//7
		System.out.print("\nInverted Half Pyramid With Numbers : \n");
		invertedHalfPyramidNumbers(rows);
		System.out.print("\n-----------------------------------------------------");
		
		//8
		System.out.print("\nFloyds Triangle: \n");
		floydsTriangle(rows);
		System.out.print("\n-----------------------------------------------------");
		
		//9
		System.out.print("\n0-1 Triangle: \n");
		triangle_01(rows);
		System.out.print("\n-----------------------------------------------------");
		
		//10 
		System.out.print("\nButterfly Pattern : \n");
		butterflyPattern(rows);
		System.out.print("\n-----------------------------------------------------");
		
		//11
		System.out.print("\nSolid Rhombus : \n");
		solidRhombus(rows); 
		System.out.print("\n-----------------------------------------------------");
		
		//12 
		System.out.print("\nHollow Rhombus : \n");
		hollowRhombus(rows); 
		System.out.print("\n-----------------------------------------------------");
		
		//13
		System.out.print("\nDiamond Pattern : \n");
		diamondPattern(rows); 
		System.out.print("\n-----------------------------------------------------");
		
		sc.close();
	}

}
