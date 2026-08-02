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
    int postidx;
      
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode helper(int[] postorder, int left, int right){
        if(left > right){
            return null;
        }
        TreeNode root = new TreeNode(postorder[postidx]);
        postidx--;
        int inidx = map.get(root.val);

        root.right = helper(postorder, inidx+1, right);
        root.left = helper(postorder, left, inidx-1);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postidx = postorder.length-1;
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        return helper(postorder, 0, inorder.length-1);
    }
}