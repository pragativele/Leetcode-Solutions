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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length-1);
    }
    public int maxNode(int nums[], int left, int right){
        int idx = left;
        for(int i=left; i<= right; i++){
            if(nums[i] > nums[idx]){
                idx = i;
            }
        }
        return idx;
    }
    public TreeNode build(int nums[], int left, int right){
        if(left > right){
            return null;
        }
        int currMax = maxNode(nums, left, right);
        TreeNode root = new TreeNode(nums[currMax]);
        root.left = build(nums, left, currMax - 1);
        root.right = build(nums, currMax + 1, right);

        return root;
    }
}