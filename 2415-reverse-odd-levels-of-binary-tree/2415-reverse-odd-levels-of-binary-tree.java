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
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
       
       int level = 0; 
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<TreeNode> ans = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                ans.add(curr);
                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
                
            }
            if(level % 2 != 0){
                    int k=0;
                    int j=ans.size()-1;
                    while(k<=j){
                        var nodek = ans.get(k);
                        var nodej = ans.get(j);
                        
                       int temp = nodek.val;
                       nodek.val = nodej.val;
                       nodej.val = temp;
                        k++;
                        j--;
                    }
                }
            level++;
        }
        return root;
    }
}