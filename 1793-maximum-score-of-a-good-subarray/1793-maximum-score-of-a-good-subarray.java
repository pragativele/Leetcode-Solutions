class Solution {
    public int maximumScore(int[] nums, int k) {
        int i = k;
        int j = k;
        int minval = nums[k];
        int ans = minval;
        while(i > 0 || j < nums.length-1){
            if(i == 0){
                j++;
            }else if(j == nums.length-1){
                i--;
            }else if(nums[i-1] >= nums[j+1]){
                i--;
            }else{
                j++;
            }
            minval = Math.min(minval, Math.min(nums[i], nums[j]));
            int len = j - i + 1;
            ans = Math.max(ans, len * minval);
        }
        return ans;

    }
}