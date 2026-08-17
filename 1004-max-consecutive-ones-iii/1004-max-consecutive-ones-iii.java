class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int low = 0;
        int res = Integer.MIN_VALUE;
        int countZero = 0;

        for(int high=0; high<n; high++) {
            int curr = nums[high];

            if(curr == 0) {
                countZero++;

                while(countZero > k) {
                    if(nums[low] == 0) countZero--;
                    low++;
                }
            }
            res = Math.max(res, high-low+1);
        }
        return res;
        
    }
}