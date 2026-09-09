class Solution {
    public int maxWidthRamp(int[] nums) {
        int rightmax[] = new int[nums.length];
        rightmax[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2; i>=0; i--){
            rightmax[i] = Math.max(nums[i], rightmax[i+1]);
        }
        int ans = 0;
        int left =0;
        int right = 0;
        while(left < nums.length && right< nums.length){
            if(nums[left] <= rightmax[right]){
                ans = Math.max(ans, right-left);
                right++;
            }else{
                left++;
            }
        }
        return ans;
    }
}