package rescursion.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OccurrencesOfKey1 {
    static List<Integer> findTheOccurrences(int arr[] , int i , ArrayList list , int key){

        if(i == arr.length ){
            return  list;
        }

        if( key == arr[i] )
            list.add(i);

        return findTheOccurrences(arr,++i,list,key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println(findTheOccurrences(arr,0, list,key));
    }
}
