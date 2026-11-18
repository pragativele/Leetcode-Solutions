class Solution {
    public boolean canJump(int[] nums) {
        int ans = 0;
        for(int i=0; i<nums.length; i++){
        
            if(i > ans){
                return false;
            }
            //give next idx after jump
            ans = Math.max(ans, i + nums[i]);
        }
        return true;
    }
}