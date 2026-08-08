package divide_and_conquer.assignments;

public class Find_Majority_Element_inArray {

    //Brute Force Approach
    private static int majorityelement(int nums[]){
        int majorElement = nums.length/2;

        for(int i = 0 ; i < nums.length ; i++ ) {
            int count = 0 ;
            for (int j = 0 ; j < nums.length ; j++ ) {
                if( nums[i] == nums[j])
                    count++;
            }

            if(count > majorElement )
                return nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,2,3,3,4,5,7,43,4,332,3232,32,3,4,4,5,5,3};
        System.out.println( majorityelement(arr));
    }
}
