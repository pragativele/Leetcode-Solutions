class NumArray {
    int numArray[];

    public NumArray(int[] nums) {
        numArray = new int[nums.length];
        numArray[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            numArray[i] = numArray[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0){
            return numArray[right];
        }else{
            return numArray[right] - numArray[left-1];
            }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */