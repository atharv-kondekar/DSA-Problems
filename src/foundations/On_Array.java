package foundations;

import java.util.*;

// What will be the Output ? 
public class On_Array {
    public static void main(String[] args) {
    	
        List<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> b = a; // same reference

        // a = a + [4] equivalent (create new list)
        a = new ArrayList<>(a);
        a.add(4);
        
        System.out.println(b);
        
     // System.out.print(a);
    }
}
