package leetcodeOct2022;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: October 2022, Day 7
 * Problem 732: My Calendar III
 */

class Day7_732_MyCalendar3 {

    Map <Integer, Integer> map;
    
    public Day7_732_MyCalendar3() {
        map = new TreeMap<>();
    }
    
    public int book(int start, int end) {
        map.put(start, map.getOrDefault(start, 0) +1);
        map.put(end, map.getOrDefault(end, 0) -1);
        
        int result = 0, current = 0;
        for (int V : map.values()) {
            current += V;
            result = Math.max(result, current);            
        }
        return result;
    }
}