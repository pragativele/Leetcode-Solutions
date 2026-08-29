class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        String[] ans = new String[score.length];
        for(int i=0; i<score.length; i++){
            q.offer(new int[]{score[i], i});
        }
        int rank = 1;
        while(!q.isEmpty()){
            int[] curr = q.poll();
            if(rank == 1){
                ans[curr[1]] = "Gold Medal";
            }else if(rank == 2){
                ans[curr[1]] = "Silver Medal";
            }else if(rank == 3){
                ans[curr[1]] = "Bronze Medal";
            }else{
                ans[curr[1]] = String.valueOf(rank);
            }
            rank++;

        }
        return ans;
    }
}