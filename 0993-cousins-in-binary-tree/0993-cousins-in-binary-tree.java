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
    int Xdepth = -1, Ydepth = -1;
    TreeNode Xparent = null, Yparent = null;
    public void helper(TreeNode curr, TreeNode parent, int depth, int x, int y){
        if(curr == null){
            return;
        }
        if(curr.val == x){
            Xdepth = depth;
            Xparent = parent;
        }else if(curr.val == y){
            Ydepth = depth;
            Yparent = parent;
        }
        helper(curr.left, curr, depth+1, x, y);
        helper(curr.right, curr, depth+1, x, y);
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        helper(root, null, 0, x, y);
        return (Xdepth == Ydepth) && (Xparent != Yparent);
    }
}