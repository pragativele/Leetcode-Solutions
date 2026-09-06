class Solution {
    public int maxSumMinProduct(int[] nums) {
        long result =0;
        Stack<long[]> s = new Stack<>();
        long prefix[] = new long[nums.length + 1];
        for(int i=0; i<nums.length; i++){
            prefix[i + 1] = prefix[i] + nums[i];
        }
        for(int i=0; i<nums.length; i++){
            long n = nums[i];
            long newstart = i;
            while(!s.isEmpty() && s.peek()[1] > n){
                long popped[] = s.pop();
                long start = popped[0];
                long val = popped[1];

                long total = prefix[i] - prefix[(int) start];
                result = Math.max(result, val * total);
                newstart = start;
            }
            s.push(new long[]{newstart, n});
        }
         while(!s.isEmpty()){ 
            long[] popped = s.pop();
            long start = popped[0];
            long val = popped[1];

            long total = prefix[nums.length] - prefix[(int)start];
            result = Math.max(result, val * total);
         } 
         return (int)(result % 1_000_000_007);
    }
}