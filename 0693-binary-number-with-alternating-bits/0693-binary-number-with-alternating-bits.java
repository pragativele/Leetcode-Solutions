class Solution {
    public boolean hasAlternatingBits(int n) {
        while( n != 0){
            int x = n & 1;
            n = n >> 1;
            int y = n & 1;
            if( x == y)
            return false;
        }
        return true;
    }
}