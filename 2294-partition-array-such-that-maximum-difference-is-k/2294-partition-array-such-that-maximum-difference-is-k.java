class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 1;
        int minval = nums[0];
        for(int num : nums){
            if(num - minval > k){
                ans++;
                minval = num;
            }
        }
        return ans;
    }
}