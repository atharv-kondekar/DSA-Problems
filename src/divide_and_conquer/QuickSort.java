package divide_and_conquer;

public class QuickSort {
public static  void printArr(int arr[]){
    for (int i = 0 ;  i < arr.length ; i++ ){
        System.out.print(arr[i]+" ");
    }
}

    public static void swap(int arr[] , int a , int b ){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static void quickSort(int arr[] , int si , int  ei){
        if(si>=ei)  return;

        int pivotIndex = partition(arr,si,ei);

        quickSort(arr,si,pivotIndex-1);
        quickSort(arr,pivotIndex+1,ei);
    }

    private static int partition(int arr[] , int si , int  ei ){
        int i = si-1;
        int pivot = arr[ei];

        for(int j = si ; j < ei ; j++ ){
            if( arr[j] <= pivot ){
                i++;
                swap(arr,i,j);
            }
        }
        i++;
        swap(arr,i,ei);

        return i;
    }


    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        printArr(arr);
        System.out.println();
        quickSort(arr,0, arr.length-1);
        printArr(arr);
    }
}
