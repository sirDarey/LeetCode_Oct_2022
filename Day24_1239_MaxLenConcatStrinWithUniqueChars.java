package leetcodeOct2022;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: October 2022, Day 24
 * Problem 1239: Maximum Length of a Concatenated String with Unique Characters
 */

class Day24_1239_MaxLenConcatStrinWithUniqueChars {
    
    int n, maxSoFar = 0;
    List<String> arr;

    public int maxLength(List<String> arr) {
        n = arr.size();
        this.arr = arr;
        
        dfs("", 0);

        return maxSoFar;
    }

    private void dfs(String s, int i) {
        Set<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) 
            if (!set.add(c)) 
                return;
        maxSoFar = Math.max(s.length(), maxSoFar);
        
        if (i == n)
            return;
        
        for (int j=i; j<n; j++) 
            dfs(s + arr.get(j), j + 1);
    }
}