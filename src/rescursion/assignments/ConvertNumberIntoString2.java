package rescursion.assignments;

import java.util.Scanner;

public class ConvertNumberIntoString2 {

    static String digits[] = {"zero" , "one" , "Two" , "Three" , "Four" , "Five" , "Six" ,
            "Seven", "Eight", "NIne"};

    static void convertNumberIntoString(int n) {
        if( n == 0){
            return;
        }

        int last = n%10;
        convertNumberIntoString(n/10);

        System.out.println(digits[last]+" ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        convertNumberIntoString(n);
    }
}
