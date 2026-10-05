class Solution {
    public long continuousSubarrays(int[] nums) {
        int left = 0;
        long count = 0;
        Deque<Integer> maxval = new ArrayDeque<>();
        Deque<Integer> minval = new ArrayDeque<>();
        for(int right = 0; right<nums.length; right++){
            while(!maxval.isEmpty() && nums[maxval.peekLast()] <= nums[right]){
                maxval.pollLast();
            }
            maxval.offerLast(right);
            while(!minval.isEmpty() && nums[minval.peekLast()] >= nums[right]){
                minval.pollLast();
            }
            minval.offerLast(right);
            while(nums[maxval.peekFirst()] - nums[minval.peekFirst()] > 2){
                left++;
                if(maxval.peekFirst() < left){
                    maxval.pollFirst();
                }
                if(minval.peekFirst() < left){
                    minval.pollFirst();
                }
            }
            count += (right - left) + 1;
        }
        return count;
    }
}