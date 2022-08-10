class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int pair=0;
        int n=nums.length;
        for(int i=2;i<n;i++)
        {
            for(int j=1;j<i;j++)
            {
                for(int k=0;k<j;k++)
                {
                 if((nums[i]-nums[j]==diff) && (nums[j]-nums[k]==diff))
                     pair+=1;
                }
            }
        }
        return pair;
    }
}
