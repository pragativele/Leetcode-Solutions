class Solution {
    public int maxDistance(int[][] grid) {
        int maxval = Integer.MIN_VALUE;
        Queue<int[]> q = new LinkedList<>();
        int rows = grid.length;
        int cols = grid[0].length;
        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
                //stores all 1(land) idx
                if(grid[r][c] == 1){
                    q.offer(new int[]{r, c});
                    grid[r][c] = 0; // land dis to itself is 0
                    //mark all 0 (water) to -1(as unvisited)
                }else{
                    grid[r][c] = -1;
                }
            }
        }
        if(q.isEmpty() || q.size() == rows * cols) return -1;
        while(!q.isEmpty()){
            int curr[] = q.poll();
            int r = curr[0];
            int c = curr[1];
            int dir[][] = {{1,0}, {-1,0}, {0, -1}, {0,1}};
            for(int[] d : dir){
                int nr = r + d[0];
                int nc = c + d[1];
//// If neighbor is unvisited water (-1), set its distance to current cell's distance + 1
                if(nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc] == -1){
                    grid[nr][nc] = grid[r][c] + 1;
                    maxval = Math.max(maxval, grid[nr][nc]);
                    q.offer(new int[]{nr, nc});
                }
            }
        }
        return maxval;
    }
}