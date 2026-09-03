class Solution {
    public int minimumDeletions(int[] nums) {
        int minidx = 0;
        int maxidx = 0;
        int minval = Integer.MAX_VALUE;
        int maxval = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > maxval){
                maxidx = i;
                maxval = nums[i];
            }
            if(nums[i] < minval){
                minidx = i;
                minval = nums[i];
            }
        }
        int left = Math.min(minidx, maxidx);
        int right = Math.max(maxidx, minidx);
        int delleft = right + 1;
        int delright = nums.length - left;
        int both = (left + 1) + (nums.length - right);
        return Math.min(both, Math.min(delleft, delright));
    }
}