package leetcodeOct2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: October 2022, Day 25
 * Problem 1662: Check If Two String Arrays are Equivalent
 */

class Day25_1662_CheckIf2StringArrsAreEqual {
    
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String one = "", two = "";
        
        for (String s1 : word1)
            one += s1;
        for (String s2 : word2)
            two += s2;
        
        return one.equals(two);
    }
}