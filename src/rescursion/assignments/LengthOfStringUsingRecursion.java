package rescursion.assignments;

import java.awt.*;
import java.util.Scanner;

public class LengthOfStringUsingRecursion {

    static int length(String s){
        if(s.length() == 0 ){
            return 0;
        }

        return length(s.substring(1))+1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Length of the String : "+length(s));
        sc.close();

    }
}
