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
     int preidx = 0;
     HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode helper(int[] preorder, int left, int right){
        if(left > right){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preidx]);
        preidx++;
        int inidx = map.get(root.val);
        

        root.left = helper(preorder, left, inidx-1);
        root.right = helper(preorder, inidx+1, right);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       for(int i=0; i<inorder.length; i++){
        map.put(inorder[i], i);
       }
        return helper(preorder, 0, inorder.length-1);
    }
}