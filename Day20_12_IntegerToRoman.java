package leetcodeOct2022;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: October 2022, Day 20
 * Problem 12: Integer to Roman
 */

class Day20_12_IntegerToRoman {
    
    Map <Integer, String> map = new HashMap<>();
    String result = "";
    
    public String intToRoman(int num) {
        
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
        
        int [] numsArray = new int[4];
        for(int i=3; i>=0; i--) {
            numsArray [i] = num%10;
            num /= 10;
        }
        
        for (int i=0; i<4; i++) {
            int E = (int)Math.pow(10, 3-i);
            
            int current = E * numsArray[i];
            
            if (i == 0) 
                helper(4000, current, "M", "D", E); 
            else if (i == 1)
                helper(500, current, "C", "D", E);
            else if (i == 2)
                helper(50, current, "X", "L", E);
            else
                helper(5, current, "I", "V", E);
        } 
        return result;
    }
    
    void helper(int range, int current, String lower, String upper, int E) {
        if (map.containsKey(current))
            result += map.get(current);
        else {
            if (range > current) {
                while (current > 0) {
                    result += lower;
                    current-=E;
                }
            } else {
                result += upper;
                while (current > range) {
                    result += lower;
                    current-=E;
                }
            }
        }
    }   
}