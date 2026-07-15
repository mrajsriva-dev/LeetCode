import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) { 
        // HashMap<Integer, Integer> map = new HashMap<>();
        
        // for(int i=0; i<nums.length; i++){
        //     int first = nums[i];
        //     int sec = target - first;

        //     if(map.containsKey(sec)){
        //         return new int[] {map.get(sec), i};
        //     }
        //     map.put(first, i);
        // }
        // return new int[] {-1, -1};

        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}