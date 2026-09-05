class Solution {
    public int nextGreaterElement(int m) {
        long n = m;
        int[] freq = new int[10];
        int curr = -1;
        int prev = -1;

        while(n > 0){
            curr = (int)n % 10;
            n = n / 10;
            freq[curr]++;
            //find the smallest no
            if(prev > curr){
                int num = curr+1;
                //swap it with next smallest no
                while(freq[num] == 0) num++;
                freq[num]--;
                n = n*10 + num;

                //sort remaining part
                for(int i=0; i<10; i++){
                    while(freq[i]-- > 0){
                        n = n*10+ i;
                    }
                }
                return n > Integer.MAX_VALUE ? -1 : (int)n;
            }
            prev = curr;
        }
        return -1;
    }
}