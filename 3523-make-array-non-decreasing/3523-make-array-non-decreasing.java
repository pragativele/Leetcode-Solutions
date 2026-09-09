class Solution {
    public int maximumPossibleSize(int[] nums) {
        Stack<Integer> s = new Stack<>();
        for(int i=nums.length-1; i>=0; i--){
            while(!s.isEmpty() && s.peek() < nums[i]){
                s.pop();
            }
            s.push(nums[i]);
        }
        return s.size();
    }
}