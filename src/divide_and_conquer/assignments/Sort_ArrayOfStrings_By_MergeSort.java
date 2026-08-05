package divide_and_conquer.assignments;


public class Sort_ArrayOfStrings_By_MergeSort {

    public static void sort(String[] sarr , int si , int ei){
        if(si>=ei){
            return;
        }

        int mid = si+(ei-si)/2;

        sort(sarr,si,mid);
        sort(sarr,mid+1,ei);

        partition(sarr,si,ei,mid);
    }

    public static void partition(String sarr[] , int si , int ei , int mid ){
        int i = si ;
        int j = mid+1;
        int k = 0;
        String temp [] = new String[ei-si+1];

        while(i<=mid && j<=ei)
        {
            if( sarr[i].compareTo(sarr[j]) < 0 ){
                temp[k++]=sarr[i];
                i++;
            }
            else{
                temp[k++]=sarr[j];
                j++;
            }
        }

        while(i<=mid){
            temp[k++] = sarr[i++];
        }

        while(j<=ei){
            temp[k++] = sarr[j++];
        }

        for(k=0;k<=temp.length-1;k++){
            sarr[si++]=temp[k];
        }
    }

    private static void printArr(String arr[]){

        for(int i = 0 ; i < arr.length ; i++ ){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        String[] sarr = {"sun" , "earth" , "moon" , "mars"};
        sort(sarr,0,sarr.length-1);
        printArr(sarr);
    }
}
