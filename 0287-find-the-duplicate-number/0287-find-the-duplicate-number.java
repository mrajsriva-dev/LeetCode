class Solution {
    public int findDuplicate(int[] nums) {
        int slow=0, fast=0;


        // find the meeting point
        while(true) {
            slow = nums[slow];
            fast = nums[fast];
            fast = nums[fast];

            if(slow == fast ) {
                break;
            }
        }
        
       // find the entrance of cycle
        slow = 0;
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
        
    }
}