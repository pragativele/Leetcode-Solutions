class Solution {
    public int findGCD(int[] nums) {
        int small =Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            small = Math.min(small, nums[i]);
            large = Math.max(large, nums[i]);
        }
        int div =1;
        for(int i=2; i<=small; i++){
            if( small % i == 0 && large % i == 0){
                div = i;
            }
        }
        return div;
    }
}