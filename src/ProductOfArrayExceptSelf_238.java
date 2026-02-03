class ProductOfArrayExceptSelf_238 {
    public int[] productExceptSelf(int[] nums) {
        int [] ansArr = new int[nums.length];
        int [] suffix = new int[nums.length];
        int n=nums.length;

        ansArr[0]=1;
        for(int i=1;i<n;i++)
        {
            ansArr[i]=ansArr[i-1]*nums[i-1];
        }

        suffix[n-1]=1;
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }

        for(int i=0;i<n;i++)
        {
            ansArr[i]=ansArr[i]*suffix[i];
        }

        return ansArr;
    }
}
