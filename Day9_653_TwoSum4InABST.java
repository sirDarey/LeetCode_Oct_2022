package leetcodeOct2022;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: October 2022, Day 9
 * Problem 653: Two Sum IV - Input is a BST
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Day9_653_TwoSum4InABST {

    Set <Integer> set = new HashSet<>();
    int k;
    
    public boolean findTarget(TreeNode root, int k) {
        this.k = k;
        return dfs(root);
    }
    
    boolean dfs(TreeNode root) {
        if (root == null)
            return false;
        
        int val = root.val;
        if (set.contains(k - val))
            return true;
        set.add(val);
        return dfs(root.left) || dfs(root.right);
    }
}