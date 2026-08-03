class Solution {
    public void setZeroes(int[][] matrix) {
        //brute force
        int m = matrix[0].length;
        int n = matrix.length;
        // int[][] copy = new int[n][m];

        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         copy[i][j] = matrix[i][j];
        //     }
        // }
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         if(matrix[i][j] == 0){
        //             for(int k=0; k<m; k++){
        //                 copy[i][k] = 0;
        //             }
        //             for(int k=0; k<n; k++){
        //                 copy[k][j] = 0;
        //             }
        //         }
        //     }
        // }
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         matrix[i][j] = copy[i][j];
        //     }
        // }
        int col0 = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if( j != 0){
                        matrix[0][j] = 0;
                    }else{
                        col0 = 0;
                    }
                }
            }
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][j] != 0){
                    if(matrix[0][j] == 0 || matrix[i][0] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        if(matrix[0][0] == 0){
            for(int j=0; j<m; j++){
                matrix[0][j] = 0;
            }
        }
        if(col0 == 0){
            for(int i=0; i<n; i++){
                matrix[i][0] = 0;
            }
        }
    }
}