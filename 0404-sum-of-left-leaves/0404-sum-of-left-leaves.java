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
    
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<TreeNode> ans = new ArrayList<>();
        q.offer(root);
        ans.add(root);
        int sum =0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                if(curr.left != null){
                    q.offer(curr.left);
                    if(curr.left.left == null && curr.left.right == null)
                    sum += curr.left.val;
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
            }
        }
        return sum;
    }
}