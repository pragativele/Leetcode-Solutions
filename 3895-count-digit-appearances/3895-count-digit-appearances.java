class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int ans = 0;
        for(int num : nums){
            int count =0;
            while(num > 0){
                int d = num % 10;
                num /= 10;
                if(d == digit)
                count++;
            }
            ans += count;
        }
        return ans;
    }
}