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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashSet<Integer> childset = new HashSet<>();
        //map stores all parent+ child val and value as treeNode of each val
        HashMap<Integer, TreeNode> map = new HashMap<>();
        //separating each val from array
        for(int des[]: descriptions){
            int parentval = des[0];
            int childval = des[1];
            boolean left = des[2] == 1;

            //if parentval not present add it to map and create TreeNode of it
            map.putIfAbsent(parentval, new TreeNode(parentval));
            TreeNode parent = map.get(parentval);

            //if childval not present add it to map and create node
            map.putIfAbsent(childval, new TreeNode(childval));
            TreeNode child = map.get(childval);

            //check if left is true add it to parent left
            if(left){
                parent.left = child;
            }else{
                parent.right = child;
            }
            //add child to set , later to compare with map for root val
            childset.add(childval);
        }
        //childset contains all child and root is not present in any child section so compare child set with map for root
        for(int root : map.keySet()){
            //val which is not present in child and present in map is root 
            if(!childset.contains(root)){
                return map.get(root);
            }
        }
        return null;

    }
}