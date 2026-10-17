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
    HashMap<Integer, Integer> map = new HashMap<>();
    int max=0;
    int maxval =0;
    int maxcount=0;
    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        map.put(root.val, map.getOrDefault(root.val, 0)+1);
        if(map.get(root.val) == maxval){
            maxcount++;
        }else if(map.get(root.val) > maxval){
            max = root.val;
            maxval = map.get(root.val);
            maxcount = 1;
        }
        inorder(root.right);
    }
    public int[] findMode(TreeNode root) {
        if(root.left == null && root.right == null){
            return new int[]{root.val};
        }
        inorder(root);
        if(maxcount == 1){
            return new int[]{max};
        }
        int[] ans = new int[maxcount];
        int idx = 0;
        for(int val: map.keySet()){
            if(map.get(val) == maxval){
                ans[idx] = val;
                idx++;
            }
        }
        return ans;

    }
}