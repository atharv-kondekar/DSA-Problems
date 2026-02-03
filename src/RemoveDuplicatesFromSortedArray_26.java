class RemoveDuplicatesFromSortedArray_26 {
    public int removeDuplicates(int[] nums) {
        
        int left=0;
        
        for(int right = 1 ; right < nums.length ; right++ )
        {
            if( nums[left] != nums[right] )
            {
                //++left = Increment then Use 
                //       = The First Element Always Unique

                nums[ ++left ] = nums[ right ];
            }
        }

        return ++left; 
        // Because left starts from ZERO (left=0)

    }
}
