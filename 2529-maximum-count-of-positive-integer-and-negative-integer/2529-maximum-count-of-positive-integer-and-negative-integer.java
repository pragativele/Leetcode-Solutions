class Solution {
    public int helper(int[] nums, int val){
        int left = 0;
        int right = nums.length-1;
        //use for count of neg no.
        int ans = nums.length;
        while(left <= right){
            int mid = left + (right - left) / 2;
            //idx where pos, 0 no. may get started
            if(nums[mid] >= val){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
    public int maximumCount(int[] nums) {
        int neg = helper(nums, 0);
        int idx = helper(nums, 1);
        int pos = nums.length - idx;
        return Math.max(neg,pos);
    }
}