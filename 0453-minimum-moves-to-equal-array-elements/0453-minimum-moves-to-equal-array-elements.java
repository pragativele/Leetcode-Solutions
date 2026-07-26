class Solution {
    public int minMoves(int[] nums) {
        int minele = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            minele = Math.min(minele, nums[i]);
        }
        int steps = 0;
        for(int i=0; i<nums.length; i++){
            steps += nums[i] - minele;
        }
        return steps;
    }
}