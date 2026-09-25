class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int len = 0;
        int left = 0;
        Deque<Integer> minval = new ArrayDeque<>();
        Deque<Integer> maxval = new ArrayDeque<>();
        for(int right =0; right< nums.length; right++){
            while(!minval.isEmpty() && nums[minval.peekLast()] >= nums[right]){
                minval.pollLast();
            }
            minval.addLast(right);
            while(!maxval.isEmpty() && nums[maxval.peekLast()] <= nums[right]){
                maxval.pollLast();
            }
            maxval.addLast(right);
            while(nums[maxval.peekFirst()] - nums[minval.peekFirst()] > limit){
                left++;
                if(maxval.peekFirst() < left){
                    maxval.pollFirst();
                }
                if(minval.peekFirst() < left){
                    minval.pollFirst();
                }
            }
            len = Math.max(len, right -left + 1);
        }
        return len;
    }
}