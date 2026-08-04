package divide_and_conquer;

public class Search_in_Sorted_and_Rotated_Array {
    private static int modifiedBinarySearch(int arr[] , int si,int ei,int target){
        if(si>ei){
            return -1;
        }

        int mid = si + (ei-si)/2;
        if(arr[mid] == target){
            return mid;
        }

        //Case 1 : Mid is on Line 1
        if(arr[si] <= arr[mid] ){
            // case a : mid's Left
            if( arr[si] <= target && target <=arr[mid]){
                return modifiedBinarySearch(arr,si,mid-1,target);
            }
            // case b : mid's right
            else{
                return modifiedBinarySearch(arr,mid+1,ei,target);
            }
        }
        //Case 2 : Mid is on Line 2
        else{
            // case c : mid's right
            if(arr[mid]<=target && target<=arr[ei]){
                return modifiedBinarySearch(arr,mid+1,ei,target);
            }
            // case d : mid's left
            else {
                return modifiedBinarySearch(arr,si,mid-1,target);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;

        System.out.println( modifiedBinarySearch(arr,0, arr.length-1,target) );
    }
}
