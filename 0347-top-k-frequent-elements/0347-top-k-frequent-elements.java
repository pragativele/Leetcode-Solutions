class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) +1);
        }
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
       
        for(int num: map.keySet()){
           q.offer(num);
           if(q.size() > k){
            q.poll();
           }
        }
        int ans[] = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = q.poll();
        }
        return ans;
    }
}