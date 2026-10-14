class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length == 0 || nums.length == 1 || nums.length == 2){
            return -1;
        }
        Arrays.sort(nums);
        return nums[(nums.length) /2];
    }
}