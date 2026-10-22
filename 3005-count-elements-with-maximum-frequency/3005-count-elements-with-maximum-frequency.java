class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int freq =0;
        int total = 0;
        for(int val : map.values()){
            if(val > freq){
                freq = val;
                total = freq;
            }else if(val == freq){
                total += freq;
            }
        }
        return total;
    }
}