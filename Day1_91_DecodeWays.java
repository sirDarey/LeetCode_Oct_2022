package leetcodeOct2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: October 2022, Day 1
 * Problem 91: Decode Ways
 */

class Day1_91_DecodeWays {
    
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n = nums.length,
            sum = 0;
        int [] result = new int[n];
        
        for (int i : nums) 
            if (i%2 == 0)
                sum += i;
        
        for (int i=0; i<n; i++) {
            int val = queries[i][0], index = queries[i][1];
            if (nums[index]%2 == 0) 
                sum -= nums[index]; 
            
            nums[index] += val;
            
            if (nums[index]%2 == 0) 
                sum += nums[index];
            result[i] = sum;
        }
        return result;
    }
}