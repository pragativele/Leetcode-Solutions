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
    public void inorder(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    public void sorted(ArrayList<Integer> list1, ArrayList<Integer> list2, ArrayList<Integer> list3){
        int i = 0;
        int j = 0;
        while(i < list1.size() && j < list2.size()){
            if(list1.get(i) <= list2.get(j)){
                list3.add(list1.get(i));
                i++;
            }else if(list1.get(i) > list2.get(j)){
                list3.add(list2.get(j));
                j++;
            }
        }
        while(j < list2.size()){
            list3.add(list2.get(j));
            j++;
        }
        while(i < list1.size()){
            list3.add(list1.get(i));
            i++;
        }
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        inorder(root1, list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        inorder(root2, list2);
        ArrayList<Integer> list3 = new ArrayList<>();
        sorted(list1, list2, list3);
        return list3;
    }
}