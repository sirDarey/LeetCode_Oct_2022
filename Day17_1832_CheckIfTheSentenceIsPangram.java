package leetcodeOct2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: October 2022, Day 17
 * Problem 1832: Check if the Sentence Is Pangram
 */

class Day17_1832_CheckIfTheSentenceIsPangram {
    
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
                return false;
        }
        String alphas = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphas.length(); i++) {
                if (sentence.indexOf(alphas.charAt(i)) == -1) {
                        return false;
                }
        }
        return true;
    }
}