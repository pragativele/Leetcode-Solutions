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
    int sum =0;
    public void helper(TreeNode root, TreeNode parent, TreeNode gp){
        if(root == null){
            return;
        }
        if(gp != null && gp.val % 2 == 0){
            sum += root.val;
        }
        helper(root.left, root, parent);
        helper(root.right, root, parent);
    }
    public int sumEvenGrandparent(TreeNode root) {
       if(root == null){
        return 0;
       }
       helper(root, null , null);
       return sum;
    }
}