class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length-1;

        while (left < right) {
            if((arr[left] < 65 || arr[left] > 90) && (arr[left] < 97 || arr[left] > 122)) {
                left++;
                continue;
            }
            if((arr[right] < 65 || arr[right] > 90) && (arr[right] < 97 || arr[right] > 122)) {
                right--;
                continue;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
        
    }
}