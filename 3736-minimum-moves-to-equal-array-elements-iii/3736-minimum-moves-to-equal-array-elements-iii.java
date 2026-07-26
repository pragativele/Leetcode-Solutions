class Solution {
    public int minMoves(int[] nums) {
        int maxnum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            maxnum = Integer.max(maxnum, nums[i]);
        }
        int step = 0;
        for(int i=0; i<nums.length; i++){
            if( nums[i] < maxnum){
                step += maxnum - nums[i];
            }
        }
        return step;
    }
}