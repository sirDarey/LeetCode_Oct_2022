package leetcodeOct2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: October 2022, Day 11
 * Problem 334: Increasing Triplet Subsequence
 */

class Day11_334_IncrTripletSubseq {

    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if (n <  3)
            return false;
        
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= min1) 
                min1 = num;
            else if (num <= min2)
                min2 = num;
            else 
                return true;
        }
        return false;
    }
}