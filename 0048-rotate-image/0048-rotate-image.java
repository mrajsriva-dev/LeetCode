class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose the given matrix and further reverse it

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse of tranpose matrix in the below

        for(int i=0; i<n; i++) {
            int left = 0;
            int right = n-1;

            while(left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        
        
    }
}