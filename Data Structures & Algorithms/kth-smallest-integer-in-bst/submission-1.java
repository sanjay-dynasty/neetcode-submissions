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

    private void inorder(TreeNode node, int[] k, int[] ans){
        if(node == null)
            return;

        inorder(node.left, k, ans);
        k[0]--;
        if(k[0] == 0){
            ans[0] = node.val;
            return;
        }
        inorder(node.right, k, ans);
    }
    public int kthSmallest(TreeNode root, int k) {
        int[] ans = new int[1];
        inorder(root, new int[]{k}, ans);
        return ans[0];

    }
}
