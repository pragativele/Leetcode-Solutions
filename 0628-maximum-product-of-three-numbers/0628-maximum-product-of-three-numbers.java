class Solution {
    public int maximumProduct(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MIN_VALUE;
        int first = Integer.MIN_VALUE;
        int second = first;
        int third = second;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > first){
                third = second;
                second = first;
                first = nums[i];
            }else if(nums[i] > second){
                third = second;
                second = nums[i];
            }else if(nums[i] > third){
                third = nums[i];
            }
            if(nums[i] < min1){
                min2 = min1;
                min1 = nums[i];
            }else if(nums[i] < min2){
                min2 = nums[i];
            }
        }
        return Math.max(first * second * third, min1 * min2 * first);
    }
}