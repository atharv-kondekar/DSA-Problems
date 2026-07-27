package rescursion.part2;

import java.util.Scanner;

public class BinaryStringProblem {

    //  Not for Consecutive 1's
    static void  binaryStringProblem(int n , int lastPlace , String str ){

        if( n == 0) {
            System.out.println(str);
            return ;
        }
        binaryStringProblem(n-1,0,str+"0");;

        if( lastPlace == 0 )
            binaryStringProblem(n-1,1,str+"1");
    }

    //  Not for Consecutive 0's
    static void binaryStringProblem2(int n , int lastPlace,String str){
        if( n == 0){
            System.out.println(str);
            return;
        }

        binaryStringProblem2(n-1,1,str+"1");

        if( lastPlace == 1 )
            binaryStringProblem2(n-1,0,str+"0");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr Lenght of the String : ");
        int n = sc.nextInt();

        binaryStringProblem(n,0,"");
        System.out.println("\n\n");
        binaryStringProblem2(n,1,"");
    }
}
