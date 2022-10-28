package leetcodeOct2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: October 2022, Day 27
 * Problem 835: Image Overlap
 */

class Day27_835_ImageOverlap {
    
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length, N = n * n;
        
        List<Integer> LA = new ArrayList<>(),  
                      LB = new ArrayList<>();
        
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < N; ++i)
            if (img1[i / n][i % n] == 1)
                LA.add(i / n * 100 + i % n);
        
        for (int i = 0; i < N; ++i)
            if (img2[i / n][i % n] == 1)
                LB.add(i / n * 100 + i % n);
        
        LA.forEach(i -> { 
            LB.forEach(j -> {
                count.put(i - j, count.getOrDefault(i - j, 0) + 1);
            });
        });
        
        int res = 0;
        for (int i : count.values())
            res = Math.max(res, i);
        
        return res;  
    }
}