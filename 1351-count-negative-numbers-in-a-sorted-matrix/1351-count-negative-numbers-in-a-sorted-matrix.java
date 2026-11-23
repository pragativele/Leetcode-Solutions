class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int row = 0;
        int count = 0;
        int col = grid[0].length - 1;
        while(row < m && col >= 0){
            if(grid[row][col] < 0){
                //if any col have -ve val then all rem col below tht-at row also have -ve val
                //(m - row) cal count of that col and do same for other col
                count += (m - row);
                col--;
            }else{
                row++;
            }
        }
        return count;
    }
}