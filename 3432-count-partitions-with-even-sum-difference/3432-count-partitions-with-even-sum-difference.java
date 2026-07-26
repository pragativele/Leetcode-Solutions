class Solution {
    public int countPartitions(int[] nums) {
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        int count = 0;
        int j=nums.length - 1;
        for(int i=0; i<prefix.length-1; i++){
            if(Math.abs(prefix[i] - (prefix[j] - prefix[i])) % 2 == 0){
                count++;
            }
        }
        return count;
    }
}