class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q = new LinkedList<>();
        int rows = mat.length;
        int cols = mat[0].length;
        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
                //stores all 0 idx
                if(mat[r][c] == 0){
                    q.offer(new int[]{r, c});
                    //mark all 1s to -1(as unvisited)
                }else{
                    mat[r][c] = -1;
                }
            }
        }
        while(!q.isEmpty()){
            int curr[] = q.poll();
            int r = curr[0];
            int c = curr[1];
            int dir[][] = {{1,0}, {-1,0}, {0, -1}, {0,1}};
            for(int[] d : dir){
                int nr = r + d[0];
                int nc = c + d[1];
//if neighbor is -1(unvisited) add -1 + curr idx val for eg. if curr idx val is 0 + (-1) = 0 so -1 idx requires 0 distance to reach to nearest 0
                if(nr >= 0 && nr < rows && nc >= 0 && nc < cols && mat[nr][nc] == -1){
                    mat[nr][nc] = mat[r][c] + 1;
                    q.offer(new int[]{nr, nc});
                }
            }
        }
        return mat;
    }
}