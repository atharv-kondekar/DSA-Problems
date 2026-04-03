package foundations;

import java.util.*;

public class On_Array_02 {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>( Arrays.asList(1, 2, 3, 4, 5) );

        Iterator<Integer> it = x.iterator();
        
        while (it.hasNext()) 
        {
            int i = it.next();
            
            if (i == 3) 
            {
                it.remove(); // SAFE removal
            }
        }

        System.out.println(x);
    }
}