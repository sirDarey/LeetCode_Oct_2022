package leetcodeOct2022;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: October 2022, Day 2
 * Problem 1155: Number of Dice Rolls With Target Sum
 */

class Day2_1155_NumOfDiceRollsWithTargetSum {
    final Map<String, Integer> memo = new HashMap<>();
    final int modulo = (int)(1e9)+7;

    public int numRollsToTarget(int n, int k, int target) { 
        if (target > n * k || target < n) return 0;
        if (n == 1) return (target <= k) ? 1 : 0;

        final String key = "" +n + k + target;

        if (!memo.containsKey(key)) {   
                int currentSum = 0;

                for (int i = k; i > 0; i--) {
                        currentSum += numRollsToTarget(n - 1, k, target - i);
                        currentSum %= modulo;
                } 
                memo.put(key, currentSum);
        } 
        return memo.get(key);
    } 
}