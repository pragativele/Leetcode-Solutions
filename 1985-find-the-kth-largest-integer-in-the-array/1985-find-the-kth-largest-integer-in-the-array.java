class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> q = new PriorityQueue<>((a,b) -> {
            if(a.length() != b.length()){
                return a.length() - b.length();
            }
            return a.compareTo(b);
        });
        for(String num : nums){
            q.offer(num);
            if(q.size() > k){
                q.poll();
            }
        }
        return q.peek();
       
    }
}