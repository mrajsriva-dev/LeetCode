class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        
        // Separate negative and positive numbers
        for(int i=0; i<nums.length; i++) {
            if(nums[i] < 0) {
                neg.add(nums[i]);
            } else {
                pos.add(nums[i]);
            }
        }
        // case 1: No negative element
        if(neg.size() == 0) {
            for(int i=0; i<pos.size(); i++) {
                pos.set(i, pos.get(i)*pos.get(i));
            }
            return pos.stream().mapToInt(Integer::intValue).toArray();
        } 
        
        //case 2: No positive numbers
        if(pos.size() == 0) {
            for(int i=0; i<neg.size(); i++) {
                neg.set(i, neg.get(i)*neg.get(i));
            }
            Collections.reverse(neg);
            return neg.stream().mapToInt(Integer::intValue).toArray();
        }

        //Both negative and positive exist
        int n1 = neg.size();
        int n2 = pos.size();

        //Square negative and reverse them
        for(int i=0; i<n1; i++) {
            neg.set(i, neg.get(i)*neg.get(i));
        }
        Collections.reverse(neg);
        
        //Square positives
        for(int i=0; i<n2; i++) {
            pos.set(i, pos.get(i)*pos.get(i));
        }

        //Merge two sorted lists
        int i=0, j=0, k=0;
        int[] result = new int[n1+n2];
        while(i < n1 && j < n2) {
            if(neg.get(i) <= pos.get(j)) {
                result[k++] = neg.get(i++);
            } else {
                result[k++] = pos.get(j++);
            }
        } // while loop ends but sum elements left in either of lists
        while(i < n1) {
            result[k++] = neg.get(i++);
        }
        while(j < n2) {
            result[k++] = pos.get(j++);
        }

        return result;
    }
}