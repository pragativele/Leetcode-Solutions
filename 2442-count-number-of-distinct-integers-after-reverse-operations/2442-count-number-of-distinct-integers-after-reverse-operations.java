class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        for(int i=0; i<nums.length; i++){
            int res = 0;
            while(nums[i] > 0){
                int rem = nums[i] % 10;
                res = res * 10 + rem;
                nums[i] /= 10;
            }
            set.add(res);
        }
        return set.size();
    }
}