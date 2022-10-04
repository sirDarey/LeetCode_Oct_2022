package leetcodeOct2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: October 2022, Day 3
 * Problem 1578: Minimum Time to Make Rope Colorful
 */

class Day3_1578_MinTimeToMakeRopeColorful {
    public int minCost(String s, int[] cost) {
        int n = s.length();
        int result = 0;
        int prev = cost[0];
        
        for (int i = 1; i < n; i++) {
            int current = cost[i];
            if (s.charAt(i) == s.charAt(i-1)) {                
                result += Math.min(current, prev);
                prev = Math.max(current, prev);
            } else
                prev = current;
        }
        
        return result;
    } 
}