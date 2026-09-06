class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int second = Integer.MIN_VALUE;
        for(int i=nums.length-1; i>=0; i--){
           
            while(!s.isEmpty() && nums[i] > s.peek()){
                second = s.pop();
            }
             if(nums[i] < second){
                return true;
            }
            s.push(nums[i]);
        }
        return false;
    }
}