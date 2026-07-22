class Solution {
    private boolean isPrime(int bits){
        if( bits <= 1){
            return false;
        }
        for(int i=2; i*i <= bits; i++){
            if(bits % i == 0){
                return false;
            }
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int count =0;
        for(int i=left; i<= right; i++){
            int bits = 0;
            int n =i;
            while( n != 0){
                if( (n & 1) == 1){
                    bits++;
                }
                n = n >> 1;
            }
            if(isPrime(bits)){
                count++;
            }
        }
        return count;
    }
}