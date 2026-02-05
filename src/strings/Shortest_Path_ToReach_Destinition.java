package strings;

public class Shortest_Path_ToReach_Destinition {

	private static double shortestPath(String path) {
		int x1=0,y1=0;
		int x2=0,y2=0;
		
		for(int i = 0 ; i < path.length() ; i++ ){
			//North
			if( path.charAt(i) == 'N') {
				y2++;
			}
			//South
			if( path.charAt(i) == 'S') {
				y2--;
			}
			//East
			if( path.charAt(i) == 'E') {
				x2++;
			}
			//West
			if( path.charAt(i) == 'W') {
				x2--;
			}
		}
		
		//This one is for understanding the Formula of the Shortest path 
			// return  Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1), 2) );
		
		return Math.sqrt( (x2*x2) + (y2*y2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1 = "WNEENESENNN";
		System.out.print("The Shortest Path for "+path1+" is : "+shortestPath(path1));
		
		String path2 = "NSW";
		System.out.print("\nThe Shortest Path for "+path2+" is : "+shortestPath(path2));
		
		String path3 = "NS";
		System.out.print("\nThe Shortest Path for "+path3+" is : "+shortestPath(path3));

	}

}
