class Solution {
    public boolean find(int[] sArr, int[] tarr) {
        for (int i=0; i<256; i++) {
            if(sArr[i] < tarr[i]) {
                return false;
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";
        int m = s.length();
        int n = t.length();

        int[] sArr = new int[256];

        int[] tarr = new int[256];
        for(int i=0; i<n; i++) {
            tarr[t.charAt(i)]++;
        }

        int low = 0;
        int start = 0;
        int res = Integer.MAX_VALUE;

        for(int high=0; high<m; high++) {
            sArr[s.charAt(high)]++;
            while(find(sArr, tarr)) {
                int len = high - low + 1;
                if ( res > len) {
                    res = len;
                    start = low;
                }
                sArr[s.charAt(low)]--;
                low++;
            }
        }

        // No valid window found
        if (res == Integer.MAX_VALUE) {
            return "";
        }
        
       return s.substring(start, start + res);
        
    }
}