package leetcodeOct2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: October 2022, Day 10
 * Problem 1328: Break a Palindrome
 */

class Day10_1328_BreakAPalindrome {

    public String breakPalindrome(String palindrome) {
        int n = palindrome.length();
        if (n == 1)
            return "";
        
        char [] result = palindrome.toCharArray();
        for (int i=0; i<n/2; i++) {
            if (result[i] != 'a') {
                result[i] = 'a';
                return new String(result);
            }
        }
        result[n-1] = 'b';
        return new String(result);
    }
}