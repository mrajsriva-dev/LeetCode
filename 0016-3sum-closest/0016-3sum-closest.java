class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int diff_sum = Integer.MAX_VALUE;
        int res_sum = 0;
        for(int i=0; i<n-2; i++) {
            int j=i+1;
            int k=n-1; 
        
            while(j<k) {
                int sum = nums[i] + nums[j] + nums[k];
                int diff = Math.abs(target-sum);
                if(diff_sum > diff){
                    diff_sum = diff;
                    res_sum = sum;
                }
                if(sum == target) return res_sum;
                if(sum < target) j++;
                else k--;   
            }
        }
        return res_sum;
        
    }
}