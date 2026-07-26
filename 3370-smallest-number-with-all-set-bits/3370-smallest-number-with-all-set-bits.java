class Solution {
    public int smallestNumber(int n) {
        int ans = 0;
        for(int i=1; i<=n; i++){
             ans = 1 << i;
            if(ans > n){
                break;
            }
        }
        return ans -1;
    }
}