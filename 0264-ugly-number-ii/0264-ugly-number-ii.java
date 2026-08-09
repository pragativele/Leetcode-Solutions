class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> q = new PriorityQueue<>();
        HashSet<Long> set = new HashSet<>();
        q.offer(1L);
        set.add(1L);
        long ugly = 1;
        for(int i=0; i<n; i++){
            ugly = q.poll();
            if(!set.contains(ugly*2)){
                q.offer(ugly*2);
                set.add(ugly*2);
            }
             if(!set.contains(ugly*3)){
                q.offer(ugly*3);
                set.add(ugly*3);
            }
             if(!set.contains(ugly*5)){
                q.offer(ugly*5);
                set.add(ugly*5);
            }
        }
        return (int) ugly;
    }
}