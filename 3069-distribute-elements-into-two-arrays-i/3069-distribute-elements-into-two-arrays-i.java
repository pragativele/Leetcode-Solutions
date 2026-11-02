class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int idx1 = 0;
        int idx2 =  0;
        arr1[idx1++] = nums[0];
        arr2[idx2++] = nums[1];

        for(int i=2; i<n; i++){
            if(arr1[idx1 - 1] > arr2[idx2 -1]){
                arr1[idx1++] = nums[i];
            }else{
                arr2[idx2++] = nums[i];
            }
        }
        int result[] = new int[n];
        int idx = 0;
        for(int i=0; i<idx1; i++){
            result[idx++] = arr1[i];
        }
        for(int i=0; i<idx2; i++){
            result[idx++] = arr2[i];
        }
        return result;
    }
}