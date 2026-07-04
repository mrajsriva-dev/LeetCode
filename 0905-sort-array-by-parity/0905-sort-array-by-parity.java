class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int k=0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] % 2 == 0){
                ans[k++] = nums[i];
                // i++;
                // k++;
            } 
        }
        for(int j=0; j<nums.length; j++) {
            if(nums[j] % 2 != 0) {
                ans[k] = nums[j];
                // j++;
                k++;
            }
        }
        return ans;
        
    }
}