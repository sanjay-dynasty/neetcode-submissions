/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int res = 0;

    private int diameter(TreeNode node) {
        if (node == null)
            return 0;

        int left = diameter(node.left);
        int right = diameter(node.right);

        res = Math.max(res, left + right);

        return 1 + Math.max(left, right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return res;

        diameter(root);

        return res;
    }
}
