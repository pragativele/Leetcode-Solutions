class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int minval = Integer.MAX_VALUE;
        int maxval = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            minval =Math.min(minval, nums[i]);
            maxval =Math.max(maxval, nums[i]);
            set.add(nums[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=minval; i<=maxval; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}