class Solution {
    private void helper(int[] nums, boolean[] used, List<Integer> curr, ArrayList<List<Integer>> ans){
        if(curr.size() == nums.length){
            ans.add(new ArrayList<>(curr)); //add copy of curr 
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(used[i]){
                continue;
            }
            used[i] = true;
            curr.add(nums[i]);
            helper(nums, used, curr, ans);

            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        boolean used[] = new boolean[nums.length];
        helper(nums, used, curr, ans);
        return ans;        
    }
}