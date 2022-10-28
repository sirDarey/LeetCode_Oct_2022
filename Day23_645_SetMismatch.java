package leetcodeOct2022;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: October 2022, Day 23
 * Problem 645: Set Mismatch
 */

class Day23_645_SetMismatch {
    
    public int[] findErrorNums(int[] nums) {
        Set <Integer> set = new HashSet<>();
        
        int repeatedNum = 0, n = nums.length;
        long sum = (n * (n+1)) / 2; //sum of an A.P
    
        for(int num : nums) {
            if (!set.add(num))
                repeatedNum = num;
            sum -= num;
        }
        
        return new int[] {repeatedNum, (int)sum + repeatedNum};
    }
}