class Solution {
    public double minimumAverage(int[] nums) {
        double avg = Double.MAX_VALUE;
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n/2; i++){
            avg = Math.min(avg, (nums[i] + nums[n-i-1])/2.0);
        }
        return avg;
    }
}