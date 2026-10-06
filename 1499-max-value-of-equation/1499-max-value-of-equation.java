class Solution {
    //curr ele = j
    //yi + yj + |xi - xj| = yi + yj + (xj - xi) = pair i-j into 1 grp(yj + xj + (yi - xi))
    public int findMaxValueOfEquation(int[][] points, int k) {
        //max deque store [yi - xi, xi] here yi - xi for max value if diff is max ans is also max and xi is used for compare xj - xi <= k
        Deque<int[]> q = new ArrayDeque<>();
        int ans = Integer.MIN_VALUE;
        for(int[] point : points){
            int xj = point[0];
            int yj = point[1];
            //xj - xi > k pop the ele
            while(!q.isEmpty() && xj - q.peekFirst()[1] > k){
                q.pollFirst();
            }
            //cal max ans
            if(!q.isEmpty()){
                ans = Math.max(ans, yj + xj + q.peekFirst()[0]);
            }
            //maintain max deque
            while(!q.isEmpty() && q.peekLast()[0] <= yj - xj){
                q.pollLast();
            }
            q.offer(new int[]{yj - xj, xj});
        }
        return ans;
    }
}