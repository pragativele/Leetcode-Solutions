class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0] == 1 || grid[n-1][n-1] == 1) return -1;
        Queue<int[]> q = new LinkedList<>();
        int rows = grid.length;
        int cols = grid[0].length;
        //store {r, c , distance of each cell from idx 0}
        q.offer(new int[]{0, 0, 1});
        //mark cell as visited 
        grid[0][0] = 1;
        while(!q.isEmpty()){
            int curr[] = q.poll();
            int r = curr[0];
            int c = curr[1];
            int dist = curr[2];
            // 8 directions
            int dir[][] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1},{-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
            // if rows and cols reaches to last idx
            if(r == n-1 && c == n-1) return dist;

            for(int[] d: dir){
                int nr = r + d[0];
                int nc = c + d[1];
                // if neighbor idx val is 0 
                if(nr >= 0 && nr < n && nc >= 0 && nc < n && grid[nr][nc] == 0){
                    //then add there idx into q with the value curr dist + 1
                    q.offer(new int[]{nr, nc, dist + 1});
                    //mark new idx as visited
                    grid[nr][nc] = 1;
                }
            }
        }
        return -1;
    }
}