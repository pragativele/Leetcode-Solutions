class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> idx = new HashMap<>();
        int deg = 0;
        int length = 0;

        for(int i=0; i<nums.length; i++){
            idx.putIfAbsent(nums[i], i);
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
            if(freq.get(nums[i]) > deg){
                deg = freq.get(nums[i]);
                length = i - idx.get(nums[i])+1;
            }else if(freq.get(nums[i]) == deg){
                length = Math.min(length, i-idx.get(nums[i]) + 1);
            }
        }
        return length;
    }
}