class Solution {
    public int find(int[] arr) {
        int maxc = -1;
        for(int i=0; i<256; i++) {
            maxc = Math.max(maxc, arr[i]);
        }
        return maxc;
    }
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int low = 0; 
        int res = Integer.MIN_VALUE;

        int[] arr = new int[256];

        for(int high=0; high<n; high++) {
            arr[s.charAt(high)]++;
            int maxcnt = find(arr);
            int len = high - low + 1;
            int diff = len - maxcnt;

            while(diff > k) {
                arr[s.charAt(low)]--;
                low++;
                maxcnt = find(arr);
                len = high - low + 1;
                diff = len - maxcnt;
            }

            len = high - low + 1;
            res = Math.max(res, len);
        }

        return res;
    }
}