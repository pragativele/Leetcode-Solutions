class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int og = image[sr][sc];
        if(og == color){
            return image;
        }
        Queue<int[]> q = new LinkedList<>();
        int rows = image.length;
        int cols = image[0].length;
        int[][] dir = {{-1,0}, {1,0}, {0,-1},{0,1}};
        image[sr][sc] = color;
        q.offer(new int[]{sr, sc});
        while(!q.isEmpty()){
            int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];
                
                for(int[] d : dir){
                    int nr = r + d[0];
                    int nc = c + d[1];
                    if(nr >= 0 && nr < rows && nc >= 0 && nc < cols && image[nr][nc] == og){
                        image[nr][nc] = color;
                        q.offer(new int[]{nr, nc});
                    }
                }
            
        }
        return image;
    }
}