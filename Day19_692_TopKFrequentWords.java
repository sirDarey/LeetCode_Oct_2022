package leetcodeOct2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: October 2022, Day 19
 * Problem 692: Top K Frequent Words
 */

class Day19_692_TopKFrequentWords {
    
    public List<String> topKFrequent(String[] words, int k) {
        Map <String, Integer> map = new HashMap<>();
        for (String word : words)
            map.put(word, map.getOrDefault(word, 0)+1);
        
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                    (a,b) -> a.getValue().equals(b.getValue())? 
                            a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue());
        
        map.entrySet().forEach(entry -> {
            pq.add(entry);
        });
        
        List <String> list = new ArrayList<>();
        for (int i=0; i<k; i++) 
            list.add(pq.poll().getKey());
        
        return list;
    }
}