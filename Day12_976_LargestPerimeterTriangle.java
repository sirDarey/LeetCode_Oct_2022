package leetcodeOct2022;

import java.util.Arrays;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: October 2022, Day 12
 * Problem 976: Largest Perimeter Triangle
 */

class Day12_976_LargestPerimeterTriangle {

    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        
        for (int i=nums.length-1; i>=2; i--) {
            if (nums[i] < nums[i-1] + nums[i-2])
                return  nums[i] + nums[i-1] + nums[i-2];
        }
        return 0;
    }
}