package leetcodeOct2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: October 2022, Day 31
 * Problem 766: Toeplitz Matrix
 */

class Day31_766_ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length,
            n = matrix[0].length;
        
        for (int i=1; i<m; i++)
            for (int j=1; j<n; j++)
                if (matrix[i][j] != matrix[i-1][j-1])
                    return false;
        
        return true;
    }
}