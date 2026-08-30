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
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> arr = new ArrayList<>();
    public List<List<Integer>> helper(TreeNode root, int targetSum){
        if(root == null){
            return new ArrayList<>();
        }
        targetSum -= root.val;
        arr.add(root.val);
        if(root.left == null && root.right == null && targetSum == 0){
                ans.add(new ArrayList<>(arr));
        }else{
            helper(root.left, targetSum);
            helper(root.right, targetSum);
        }
        arr.remove(arr.size() - 1);
        return ans;
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
         return helper(root, targetSum);
         
    }
}