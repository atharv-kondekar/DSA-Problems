package backtracking.basicexample;

import java.util.Arrays;
import java.util.stream.Stream;

public class BackTrackingOnArray {

    public static void changeArray(int arr[],int i,int val){

        if ( i == arr.length ){
            printArr(arr);
            return;
        }

        //Recursion
        arr[i]=val;
        changeArray(arr,i+1,val+1);
        arr[i]-=2; // Backtracking Step
    }

    public static void printArr(int arr[]){
        Arrays.stream(arr)
                .forEach(ele -> System.out.print(ele+" ") );
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArray(arr,0,1);
        printArr(arr);
    }
}
