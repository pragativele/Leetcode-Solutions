class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length / 2];
        int steps = 0;
        for(int i=0; i<nums.length; i++){
            steps += Math.abs(mid - nums[i]);
        }
        return steps;
    }
}