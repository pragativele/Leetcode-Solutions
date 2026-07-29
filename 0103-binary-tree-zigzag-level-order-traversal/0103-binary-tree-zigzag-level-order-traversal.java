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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        boolean rev = true;
        ArrayList<Integer> ans = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return list;
        }
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr == null){
                if(!rev){
                  Collections.reverse(ans);  
                }
                 list.add(ans);
                ans = new ArrayList<>();
                rev = !rev;
               
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                ans.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        return list;
    }
}