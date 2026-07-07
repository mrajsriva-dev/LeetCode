class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l1 = new ArrayList<>();
        
        Arrays.sort(nums);
        int n = nums.length;
        
        
        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int left = i+1;
            int right = n-1;
            int sum = -1*nums[i];  // a[i] + a[left] + a[right] = 0 , so a[left] + a[right] = -a[i]
            // then find two sum 
            while(left<right){
                int s = nums[left] + nums[right];
                if(s==sum){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    l1.add(temp);
                    left++;
                    right--;
                    while(left<n && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(right>=0 && nums[right]==nums[right+1]){
                        right--;
                    }
                }
                else if(s<sum) left++;
                else right--;
            }
        }
        return l1;
        
    }
}