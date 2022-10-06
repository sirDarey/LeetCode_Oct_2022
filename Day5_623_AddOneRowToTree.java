package leetcodeOct2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: October 2022, Day 5
 * Problem 623: Add One Row to Tree
 */

class Day5_623_AddOneRowToTree {
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
    
    int val; 
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        this.val = val;
        return recur(root, depth);
    }
    
    TreeNode recur (TreeNode root, int depth) {
        
        if (depth == 0 || depth == 1) 
            return add(val, root, depth);
        
        if (root != null) {
            root.left = recur(root.left, (depth > 2)? depth - 1 : 1);
            root.right = recur(root.right, (depth > 2)? depth - 1 : 0);
        }
        return root;
    }
    
    TreeNode add(int val, TreeNode root, int depth) {
        TreeNode newNode = new TreeNode(val);
        if (depth == 1)
            newNode.left = root;
        else 
            newNode.left = null;

        if (depth == 0)
            newNode.right = root;
        else 
            newNode.right = null;
        
        return newNode;
    }
}