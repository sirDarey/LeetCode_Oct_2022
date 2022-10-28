package leetcodeOct2022;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: October 2022, Day 21
 * Problem 219: Contains Duplicate II
 */

class Day21_219_ContainsDuplicate2 {
    
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map <Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num) 
                && (i - map.get(num) <= k)) 
                 return true;
            map.put(num, i);            
        }
        return false;
    }
}