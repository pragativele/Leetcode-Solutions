class Solution {
    public int shortestSubarray(int[] nums, int k) {
        //len initialize to n + 1 coz no subarray >= k so we need to return -1 
        int len = nums.length+1;
        int left = 0;

        long[] prefixsum = new long[nums.length + 1];
        //monotonic deque(inc order)
        Deque<Integer> q = new ArrayDeque<>();

        for(int i=0; i<nums.length; i++){
            prefixsum[i+1] = prefixsum[i] + nums[i];
        }
        for(int i=0; i<=nums.length; i++){
        
            while(!q.isEmpty() && prefixsum[i] - prefixsum[q.peekFirst()] >= k){
                len = Math.min(len, i - q.pollFirst());
            }
            //maintain inc order deque
            while(!q.isEmpty() && prefixsum[i] <= prefixsum[q.peekLast()]){
                q.pollLast();
            }
            q.addLast(i);
        }
        return len <= nums.length ? len : -1;
    }
}