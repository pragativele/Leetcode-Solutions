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
    TreeNode ans = null;
    TreeNode nxtRight = null;
    public TreeNode increasingBST(TreeNode root) {
        if(root == null){
            return null;
        }
        increasingBST(root.left);
        root.left = null;
        if(nxtRight != null){
            nxtRight.right = root;
        }else{
            ans = root;
        }
        nxtRight = root;
        increasingBST(root.right);
        return ans;
    }
}