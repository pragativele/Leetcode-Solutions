class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int ans = 0;
        for(int num : nums){
            q.add(num);
        }
        for(int i=0; i<k; i++){
            ans = q.poll();
        }
        return ans;
    }
}