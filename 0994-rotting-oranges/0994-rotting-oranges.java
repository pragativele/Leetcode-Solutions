class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int rows = grid.length; 
        int cols = grid[0].length;
        //store rotten idx and check for there neighbors val if it 1 update it to 2 decrement freshcount and add new rotten idx into q
        Queue<int[]> q = new LinkedList<>();
        int freshcount = 0;
        for(int r = 0; r<rows; r++){
            for(int c=0; c<cols; c++){
                //store rotten oranges into queue
                if(grid[r][c] == 2){
                    q.offer(new int[]{r, c});
                    //count freq of fresh oranges
                }else if(grid[r][c] == 1){
                    freshcount++;
                }
            }
        }
        //fresh oranges == 0 there is nothing to rotten
        if(freshcount == 0){
            return 0;
        }
        int mini = 0;
        //directions val for up, down, left, right
        int[][] dir = {{-1,0}, {1,0}, {0,-1},{0,1}};
        //bfs
        while(!q.isEmpty() && freshcount > 0){
            int size = q.size();
            for(int i=0; i<size; i++){
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];
                for(int[] d : dir){
                    //neighbor idx of rotten idx
                    int nr = r + d[0];
                    int nc = c + d[1];
                    //check if there val is 1
                    if(nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc] == 1){
                    grid[nr][nc] = 2;
                    freshcount--;
                    q.offer(new int[]{nr, nc});
                }
                }
            }
            mini++;
        }
        return freshcount == 0 ? mini : -1;
    }
}