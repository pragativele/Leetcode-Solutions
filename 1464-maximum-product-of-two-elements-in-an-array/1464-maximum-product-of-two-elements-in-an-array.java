class Solution {
    public int maxProduct(int[] nums) {
        int d0 = 0;
        int d1 = 0;
        int maxval = Integer.MIN_VALUE;
        for(int num : nums){
            if(num > d0){
                d1 = d0;
                d0 = num;
            }else if(num > d1){
                d1 = num;
            }
        }
        return (d0 -1) * (d1 -1);
    }
}