package leetcodeOct2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: October 2022, Day 4
 * Problem 112: Path Sum
 */

class Day4_112_PathSum {
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
    
    int targetSum;
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        this.targetSum = targetSum;
        
        if  (root == null)
            return false;
    
        return recur (root, 0);     
    }
    
    boolean recur (TreeNode root, int sum) {         
        int currentSum = sum + root.val;
        
        if (root.left != null && recur(root.left, currentSum))
            return true;
        if (root.right != null && recur(root.right, currentSum))
            return true;
        
        return (currentSum == targetSum && root.left==null && root.right == null);
    }
}