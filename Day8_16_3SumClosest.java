package leetcodeOct2022;

import java.util.Arrays;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: October 2022, Day 8
 * Problem 16: 3Sum Closest
 */

class Day8_16_3SumClosest {

    public int threeSumClosest(int[] nums, int target) {
        int n =  nums.length;
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        
        for (int i=0; i<n-2; i++) {
            int firstNo = nums[i];
            int j = i+1, k = n-1;
            
            while  (j <= k) {
                int sum = firstNo + nums[j] + nums[k];
                closestSum = (Math.abs(sum - target) < Math.abs(closestSum - target))?
                        sum : closestSum;
                
                int mid = k + (j-k)/2;
                if (sum > target)
                    k = mid - 1;
                else if (sum < target)
                    j = mid + 1;
                else
                    return target;
            }
        }
        return closestSum;
    }
}