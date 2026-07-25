class Solution {
    public int differenceOfSum(int[] nums) {
        int ele = 0;
        int digit = 0;
        for(int i=0; i<nums.length; i++){
            ele += nums[i];
            while(nums[i] > 0){
                digit += nums[i] % 10;
                nums[i] /= 10;
            }
        }
        return Math.abs(ele-digit);
    }
}