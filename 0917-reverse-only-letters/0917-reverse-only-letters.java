class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length-1;

        while (left < right) {
            if((arr[left] < 65 || arr[left] > 90) && (arr[left] < 97 || arr[left] > 122)) {
                //if (!Character.isLetter(arr[left]))
                left++;
                continue;
            }
            if (!Character.isLetter(arr[right])) {
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