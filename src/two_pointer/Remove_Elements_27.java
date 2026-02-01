package two_pointer;

class Remove_Elements_27 {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int n = nums.length;

        for ( int right = 0 ; right< n ; right++ )
        {
            if( nums[right] != val )
            {
                nums[left] = nums[right];
                left++;
            }
        }

        return left;
    }
}
