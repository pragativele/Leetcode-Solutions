class Solution {
    private void helper(int[] arr, int i, int target, ArrayList<List<Integer>> ans, ArrayList<Integer> combin){
        if(target == 0){
            ans.add(new ArrayList<>(combin));
            return;
        }
        if(i == arr.length || target < 0){
            return;
        }
        
        combin.add(arr[i]);
        //single 
        helper(arr, i, target-arr[i], ans, combin);
        
        //exclude
        combin.remove(combin.size()-1);
        helper(arr, i+1,target, ans, combin);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> combin = new ArrayList<>();
        helper(candidates, 0, target, ans, combin);
        return ans;
    }
}