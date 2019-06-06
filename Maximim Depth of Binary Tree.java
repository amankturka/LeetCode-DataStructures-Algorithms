/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        //Algorithm
        //FInd depth of left and right subtree
        //max + 1 (root) = result
        if(root == null) return 0;
        int leftDepth = 0;
        int rightDepth = 0;
        leftDepth = maxDepth(root.left);
        rightDepth = maxDepth(root.right);
        return Math.max(leftDepth,rightDepth)+1;
    }
}