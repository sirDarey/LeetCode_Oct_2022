package leetcodeOct2022;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: October 2022, Day 6
 * Problem 981: Time Based Key Value Store
 */

class Day6_981_TimeBasedKeyValueStore {
    Map <String, TreeMap> timeMap;
       
    public Day6_981_TimeBasedKeyValueStore() {
        timeMap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        timeMap.putIfAbsent(key,new TreeMap<>());
        timeMap.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        TreeMap<Integer,String> temp = timeMap.getOrDefault(key,null);
        if(timeMap.get(key) == null || temp.floorKey(timestamp) == null)
            return "";
        return temp.get(temp.floorKey(timestamp));  
    }
}