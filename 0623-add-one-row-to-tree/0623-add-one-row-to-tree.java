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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode newroot = new TreeNode(val);
            newroot.left = root;
            return newroot;
        }
        helper(root, val, depth, 1);
        return root;
    }
    public void helper(TreeNode root, int val, int depth, int currdepth){
        if(root == null){
            return;
        }
        if(currdepth == depth-1){
            TreeNode templeft = root.left;
            TreeNode tempright = root.right;
            
            root.left = new TreeNode(val);
            root.right = new TreeNode(val);

            root.left.left = templeft;
            root.right.right = tempright;
            return;
        }
        helper(root.left, val, depth, currdepth+1);
        helper(root.right, val, depth, currdepth+1);
    }
}