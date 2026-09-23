class Solution {
    public int minimumSum(int num) {
        int d0 = Integer.MAX_VALUE;
        int d1 = Integer.MAX_VALUE; 
        int d2 = Integer.MAX_VALUE; 
        int d3 = Integer.MAX_VALUE;
        while(num != 0){
            int n = num % 10;
            if(n < d0){
                d3 = d2;
                d2 = d1;
                d1 = d0;
                d0 = n;
            }else if(n < d1){
                d3 = d2;
                d2 = d1;
                d1 = n;
            }else if(n < d2){
                d3 = d2;
                d2 = n;
            }else{
                d3 = n;
            }
            num = num / 10;
        }
        return (10 * d0 + d2) + (10 * d1 + d3);
    }
}