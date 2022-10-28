package leetcodeOct2022;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: October 2022, Day 26
 * Problem 523: Continuous Subarray Sum
 */

class Day26_523_Continuous_Subarray_Sum {
    
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length == 1)
            return false;
        
        Map <Integer, Integer> map = new HashMap(); 
        map.put(0, -1);
        int sum = 0;
        
        for(int i=0; i<nums.length; i++){
            sum+=nums[i]; 
            int mod = sum%k;
            
            if(map.containsKey(mod) && i-map.get(mod)>1) 
                return true; 
            
            map.putIfAbsent(mod,i);
        }
        return false;
    }
}